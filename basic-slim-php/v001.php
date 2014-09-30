<?php 


// http://coenraets.org/blog/2011/12/restful-services-with-jquery-php-and-the-slim-framework/
require('vendor/autoload.php');
//require 'Slim/Slim.php';

$app = new Slim\Slim();

//http://localhost/collections-code-kata/basic-slim-php/v001.php/books/123
$app->get('/books/:id', function($id) {
	echo 'ID da consulta -> ' . $id;
});

$app->get('/redirect', function() {
	echo "redirect.....";
	$app->redirect('/books/999');
});

$app->get('/wines', 'getWines');
$app->get('/wines/:id',  'getWine');
$app->post('/wines', 'addWine');
$app->put('/wines', 'updateWine');
$app->delete('/wines/:id', 'deleteWine');


$app->run();

function deleteWine() {
	echo "delete wines";
}

function getWines() {
	echo "GET getWines";
}	

function getWine($id) {
	echo "GET getWines com ID " . $id;
}

function addWine() {
	$request = Slim\Slim::getInstance()->request();
	$wine = json_decode($request->getBody());
	echo "coo" . json_encode($wine) ;
	
}

function updateWine() {
	echo "update wine";
}

?>