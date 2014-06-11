<?php   
    require_once("Stack.php");

    abstract class Enum {
        const EQUAL = 0;
        const PRIORITY = 1;
        const NONE = 2;
    };

    class ConvertExpressionInfixToPostfix {


        private $expression = array();
        
        private function toExpression($value) {
            return explode(" ", $value);            
        }
        
        private function isOperation($digit) {
            
            $operations = array("+", "-", "*", "/", "(", ")");
            
            return in_array($digit, $operations);
            
        }
        
        private function toResult($value) {
            
            $result = "";            
            foreach ($value as $item):                              
                
                $result .=  ( $result == "" ) ? $item : " " . $item ;
                
            endforeach;
            
            return $result;    
            
        }

        private function priority($valuestack, $valuedigit) {

            return ( ( $this->checkHierarchyOperation( $valuestack, $valuedigit ) == Enum::PRIORITY ) || 
                                ($this->checkHierarchyOperation( $valuestack, $valuedigit ) == Enum::EQUAL ) );                                               


        }
        
        private function checkHierarchyOperation($valuestack, $valuedigit) {
            
            $precedence = array( 
                            "+" => 1, 
                            "-" => 1, 
                            "*" => 2, 
                            "/" => 2,
                            "^" => 5);
            
            if (!array_key_exists($valuestack, $precedence) ) 
                //throw new Exception("Key stack {$valuestack} not found in array");
                return Enum::NONE;
            
            if (!array_key_exists($valuedigit, $precedence) ) 
                //throw new Exception("Key digit {$valuedigit} not found in array");
                return Enum::NONE;
             
            if ( $precedence[$valuestack] == $precedence[$valuedigit] ) {
                return Enum::EQUAL;
            } elseif ( $precedence[$valuestack] > $precedence[$valuedigit] ) {       
                return Enum::PRIORITY;
            } else {
                return Enum::NONE;
            } 
                         
            
        } 
        
        public function __construct($expression) { 

            $this->expression = $this->toExpression( $expression );
        }                
        
        public function convert() {
            $stack = new Stack();                         
                    
            $postfix = array();            
                  
            foreach ($this->expression as $digit) {
                           
                if ( $this->isOperation($digit) ) {
                                  
                    if ($stack->isEmpty()) {
                        $stack->push($digit);                                      
                    } else {                          
                                         
                        if ($this->priority($stack->top(), $digit)) {

                            while ($this->priority($stack->top(), $digit))  {
                                array_push( $postfix, $stack->pop());                                                        

                                if ($stack->isEmpty()) {
                                    break;
                                }
                            }                                

                        }                        
                        $stack->push($digit);       
                    }                    
                    
                } else {                    
                    array_push( $postfix, $digit);
                }
                    
            }
            
            
            while (! $stack->isEmpty()) {                                
                array_push( $postfix, $stack->pop() );
            } 
                         
          
            return $this->toResult($postfix);
        }       
      
        
    }
    
?>

