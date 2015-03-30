<?php 

require 'vendor/autoload.php';

use Slim\Slim;

$loader = new Twig_Loader_Filesystem('views/');
$twig = new Twig_Environment($loader, array());


$app = new Slim(array(
      'view' => $twig
));


$app->get('/', function () {    
    echo $twig->render('index.html',array() );
    //$app->render('index.html', array('userShortInfo' => $userShortInfo));
    echo "eee";
});

$app->run();