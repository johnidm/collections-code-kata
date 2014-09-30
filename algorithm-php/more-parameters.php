<?php 


function execute_jobs () {
	
    echo "Number of parameters " . func_num_args() . PHP_EOL;
   
	// using classic loop
    $ct = func_num_args(); // get number of arguments
    for ($i=0; $i<$ct; $i++) {
        echo func_get_arg($i) . PHP_EOL; // get value argiments
    }

    // using for each loop 
    $parameters = func_get_args(); // get a list of arguments
    foreach ($parameters as $parameter):
    	echo $parameter . PHP_EOL;
    endforeach;
  
}

execute_jobs('argument1');
execute_jobs('argument1', 'argument2', 'argument3');

/*
function execute_jobs($text, $value = null, ...$params) {
	
	echo "Text " . $text . PHP_EOL;
	echo "Value " . $value . PHP_EOL;
	//echo  "Number of parameters " . count($params) . PHP_EOL
}


//execute_jobs(); // occurred error 

execute_jobs("Hello"); 
//execute_jobs("Hello", 12.44); 
execute_jobs("Hello", 12.44, "argument1"); 
//execute_jobs("Hello", 12.44, "argument1", "argument2", "argument3"); 
*/

// it is possible to define other parameter in function execute_jobs

Case 1:

function execute_jobs ($text)

execute_jobs('Hello', 'argument1');
execute_jobs('Hello', 'argument1', 'argument2', 'argument3');

Case 2
function execute_jobs($text, ...$args)

execute_jobs('Hello', 'argument1');
execute_jobs('Hello', 'argument1', 'argument2', 'argument3');



?>