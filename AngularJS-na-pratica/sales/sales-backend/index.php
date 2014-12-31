<?php

ini_set('display_startup_errors',1);
ini_set("display_errors", 1);
error_reporting(E_ALL);

session_start();

header('Access-Control-Allow-Origin: *'); 

require 'Config.php';
require 'DB.php';

require 'vendor/autoload.php';

$app = new \Slim\Slim(array('debug' => false));

//$app->contentType("application/json");


$app->error(function (Exception $e = null) use ($app) {
	echo '{"error" : { "text" : "' . $e->getMessage() . '"}}';
});



include("employee.php");
include("customer.php");

function formatJSON($obj) 
{
	echo json_encode($obj);
}

$app->run();