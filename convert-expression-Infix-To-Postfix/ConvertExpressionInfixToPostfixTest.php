<?php
    // The kata problem - https://sites.google.com/site/tddproblems/all-problems-1/convert-infix-expression-to-postfix-form
    // http://scriptasylum.com/tutorials/infix_postfix/algorithms/infix-postfix/
    // http://cs-study.blogspot.com.br/2012/11/infix-to-postfix-conversion.html
    // https://www.youtube.com/watch?v=uh7fD8WiT28
    // https://www.youtube.com/watch?v=rA0x7b4YiMI
    // https://www.youtube.com/watch?v=fUxnb5eTRS0 

    require_once("../source/ConvertExpressionInfixToPostfix.php");
    
    class ConvertExpressionInfixToPostfixTest extends PHPUnit_Framework_TestCase {
               
        /**
         * @dataProvider expressions
         */
        public function testBasicIndexZero($valueInfix, $valuePostfix) {         
            
            $convert = new ConvertExpressionInfixToPostfix($valueInfix);                    
            
            $this->assertEquals($valuePostfix, $convert->convert());
        }    
        
        public function expressions() {
            return array(                
              array("a + b", "a b +"),
              array("7 * 8", "7 8 *"),
              array("2 + 6 - 2", "2 6 + 2 -" ),
              array("2 * 3 - 10 / 4", "2 3 * 10 4 / -"),
              array("a + b * c - d", "a b c * + d -"),
              array("2 + 1 * 4 - 5 * 5 + 5 - 8 / 7 - 9", "2 1 4 * + 5 5 * - 5 + 8 7 / - 9 -"),
              array("( 2 + 2 ) * 4", "2 2 + 4 *")
            );                                   
        }
    }   
    

?>
