angular.module('contatooh').controller('ContatoController', function($scope, $routeParams, $resource, Contato) {

	console.log($routeParams.id);
	
	if ($routeParams.id) {
		Contato.get({id: $routeParams.id}, 
		function(contato){
			console.log('E');
			$scope.contato = contato;
		},
		function(erro) {
			$scope.mensagem = {
				texto: 'Não foi possível obter o contato'
			};
			console.log(erro);

		});
	} else {
		$scope.contato = new Contato();
	};

	$scope.salva = function() {

		console.log($scope.contato);

		$scope.contato.$save()
			.then(function() {
				$scope.mensagem = {texto: 'Salvo com sucesso!'};

				$scope.contato = new Contato();	
				//$scope.btnBackFocus = true;

				$scope.$broadcast('contatoSalvo');

			})
			.catch(function(erro){
				$scope.mensagem = {texto: 'Não foi possível salvar o contato!'};
				console.log(erro);
			});
	}

	Contato.query(function(contatos) {
		$scope.contatos = contatos;
	});
	console.log($scope.contatos);
});