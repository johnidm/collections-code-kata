function clientesController($scope, $http, $routeParams, $location) {

	$scope.rows = null;

	$scope.row = null;

	$scope.currentPage = 0.
	$scope.pageSize = 15;

	$scope.numberOfPages = function() {
		return Math.ceil($scope.rows.length / $scope.pageSize);
	}

	$scope.loadAll = function() {
		
		$scope.showLoader();

		var url = $scope.server("/customers");

		console.log(url);

		$http.get(url).success(function(data) {
			$scope.rows = data;
		});

	}

	$scope.loadRow = function() {



		if ($routeParams.id != null)
		{
			$scope.showLoader();
			$http.get($scope.server("/customer/" + $routeParams.id))
				.success(function(data) {
					$scope.row = data;
					$scope.row.isUpdate = true;
			});
		}
		else 
		{
			$scope.row = {}
			$scope.row.CustomerID = null;
			$scope.row.isUpdate = false;
		}
	}

	$scope.save = function() {

		//console.log(JSON.stringify($scope.row));

		var url = $scope.server("/customer/" + $routeParams.id);
		console.log(url);

		$scope.showLoader();

		$http.post(url, JSON.stringify($scope.row))
			.success(function(data) {
				alert("Salvo com sucesso");
				$scope.row.isUpdate = true;
			});

	}

	$scope.del = function() {
		if (confirm("Deseja excluir " + $scope.row.CustomerID + "?")) {
			$http.delete($scope.server("/customer/" + $routeParams.id))
				.success(function(s) {
					alert("Excluído com sucesso");
					$location.path("/clientes")
				});
		}
	}
}