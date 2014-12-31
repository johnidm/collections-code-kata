SERVER_URL = "http://localhost:8000"

$app = angular.module('app', []);

$app.config( function($routeProvider, $httpProvider) {

	$routeProvider
		.when('/', {templateUrl : 'view/main.html'})
		.when('/clientes', 
			{templateUrl : 'view/clientes/main.html', controller:clientesController})
		.when('/cliente/new', 
			{templateUrl : 'view/clientes/update.html', controller:clientesController})
		.when('/cliente/:id', 
			{templateUrl : 'view/clientes/update.html', controller:clientesController})

		.when('/funcionarios', 
			{templateUrl : 'view/funcionarios/main.html', controller:funcionariosController})

		.otherwise({redirectTo : '/'})

/*
	$httpProvider.responseInterceptors.push(function($q,$rootScope) {
		return function(promise) {

			$rootScope.hideLoader();
			return promise.then(function(response) {

				return(response);
			}, function(response) {

				$data = response.data;
				$error = $data.error;
				
				if ($error && $error.text)
					alert("ERROR: " + $error.text);
				else{
					if (response.status=404)
						alert("Erro ao acessar servidor. Página não encontrada.");
					else
						alert("ERROR! See log console");
					}
					return $q.reject(response);
			});
		}
	});
*/

});


$app.run(function($rootScope) {

	$rootScope.showLoaderFlag = false;

	$rootScope.showLoader = function() {
		$rootScope.showLoaderFlag=true;
	}

	$rootScope.hideLoader = function() {
		$rootScope.showLoaderFlag=false;	
	}

	$rootScope.server = function(url) {
		return SERVER_URL + url;
	}

});

$app.filter('startForm', function() {
	return function(input, start) {
		if (input == null) 
			return null;

		start = +start;
		return input.slice(start);
	}
});












