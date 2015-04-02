<?php 


require 'vendor/autoload.php';

/*
use GuzzleHttp\Client;

$client = new Client();
//$response = $client->get('http://localhost:8000/collectlinks');
//$response = $client->delete('http://localhost:8000/collectlink/41');
echo $response;
*/

$app = new \Slim\Slim();

header('Access-Control-Allow-Origin: *');
header('Access-Control-Allow-Methods: GET, POST, PUT, DELETE, OPTIONS');
header('Access-Control-Allow-Headers: Origin, X-Requested-With, Content-Type, Accept');

$app->get('/links/', function () {
    
	echo "GET Links";

});

$app->delete('/link/:id', function ($id) {
    echo "DELETE Link, $id";
});

$app->options('/link/:id', function ($id) {
    echo "option Link, $id";
});


$app->run();

?>