angular.module('contatooh').controller('ContatosController', ["$scope", "$resource", "Contato", function($scope, /*$http*/ 
	$resource, Contato) {

	$scope.contatos = [];
	$scope.total = 0;

	$scope.mensagem = {texto: ''};

	$scope.filtro = '';

	function buscaContatos() {
		Contato.query(
			function(contatos) {
					console.log("Consulta de contatos...");
					$scope.contatos = contatos;
			},
			function(erro) {
					$scope.mensagem = {texto: 'Não foi possível obter a lista de contatos!'};


					console.log(erro);
		});
	}

	$scope.remove = function(contato) {

		console.log(contato);

		var promise = Contato.delete({id: contato._id}).$promise;
		promise
			.then(buscaContatos)
			.catch(function(erro){
				$scope.mensagem = {texto: 'Não foi possível remover o contato!'};
				console.log(erro);
			});
	};

	
	buscaContatos();



/*
	$http.get('/contatos')
	.success(function(data) {
		$scope.contatos = data;
	})
	.error(function(statusText) {
		console.log("Não foi possível obter a lista de contatos!");
		console.log(statusText);
	});

*/
	
}]);