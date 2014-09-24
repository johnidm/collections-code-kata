<?php
    // http://localhost/collections-code-kata/basic-slim-php/server.php
	require 'vendor/autoload.php';

	/*
	//instancie o objeto
	$app = new \Slim\Slim();
	 
	//defina a rota
	$app->get('/', function () { 
	  echo "Hello, World!"; 
	}); 
	//rode a aplicação Slim 
	$app->run();
	*/


	//instancie o objeto
	$app = new \Slim\Slim(array(
	'templates.path' => 'templates'
	));
	 
	//defina a rota
	$app->get('/', function () use ($app){ 
	  //defina
	  $data = array("data"=>array("Hello"=>"World!")); 
	  //set o arquivo de template
	  $app->render('default.php',$data,200); 
	}); 
	 

	$app->group('/users',function() use ($app){
	 
	  //rota para a home
	  $app->get('/',function() use ($app){
	    //exemplo de lista de usuarios
	    $users = array(
	     'users'=>array(
	       'jo'=>'senhadejo',
	       'luca'=>'senhaluca',
	       'yasmin'=>'senhayasmin',
	       'eric'=>'seric'
	     )
	    );
	    $data = array(
	      'data'=>$users
	      );
	    $app->render('default.php',$data,200);
	  });
	 
	  //rota para login
	  $app->post('/login/',function() use ($app){
	    if(isset($_POST))
	    {
	      $data = $_POST;
	      $app->render('default.php',$data,200);
	    }
	    else
	    {
	      $app->render(404);
	    }
	  });
	 
	});
	 
	//rode a apliçicação Slim
	$app->run();

?>