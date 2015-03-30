<?php 

require 'vendor/autoload.php';

use Slim\Slim;
use Slim\Views\Twig as Twig;

use library\Primeiro;

$app = new Slim(array(
		'debug' => false,
      	'view' => new Twig,
      	'templates.path' => '.'
      //'templates.path' => __DIR__.'/templates/',
));


$app->get('/ola', function () use ($app) {       
  	$primeiro = new Primeiro();
    echo $primeiro->digaOla();
});


$app->get('/', function () use ($app) {     


    $app->render('index.html', array() );
});

$app->get('/erro', function () use ($app) {        
    
	throw new Exception("Erro no Slim");

});

$app->get('/clientes/:id', function($id) {
	echo 'Consultando o cliente ' . $id;
});

$app->get('/clientes/:id/:ano', function($id, $ano) {
	echo 'Consultando o cliente ' . $id . ' ano ' . $ano;
});

$app->get('/clientes/:id/:ano/(:mes)', function($id, $ano, $mes = null ) {
	echo 'Consultando o cliente ' . $id . ' ano ' . $ano . ' mês ' . ( ($mes == null) ? "não informado" : $mes );	
});


$app->post('/clientes', function() use ($app) {

	echo 'Gravando cliente';
	$request = Slim::getInstance()->request()->getBody();
	var_dump($request);

	$app->response->headers['Location'] = '';
	$app->response->setStatus(201);
	
});

$app->put('/clientes/:id', function($id) use ($app) {

	echo 'Alterando cliente ' . $id;
	$request = $app->request()->getBody();

	$cliente = json_decode($request);

	echo $cliente->nome;
	$app->response->setStatus(204);

});

$app->delete('/clientes/:id', function($id) {
	echo 'Excluindo cliente ' . $id;
	$app->response->setStatus(204);
});

$app->error(function(Exception $e = null) use ($app) {


	echo "Oppss! um erro ocorreu... " . $e->getMessage();
});


$app->run();

// composer.phar require slim/views