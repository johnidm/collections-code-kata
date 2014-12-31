function funcionariosController($scope, $http, $routeParams, $location) {

	$scope.rows = null;

	$scope.row = null;

	$scope.currentPage = 0.
	$scope.pageSize = 15;

	$scope.loadAll = function() {
		$scope.showLoader();
		$http.get($scope.server("/employees")).success(function(data) {
			$scope.rows = data;
		});
	}

	$scope.loadRow = function(id) {
		
		
		$scope.showLoader();
		$http.get($scope.server("/employee/" + id))
			.success(function(data) {
				$scope.row = data;
				$scope.row.isUpdate = true;
		});
		
		
	}

	$scope.save = function() {
		$scope.showLoader();

		$http.post($scope.server("/employee/"), $scope.row)
			.success(function(data) {
				alert("Salvo com sucesso");
				$scope.loadAll();
			});

	}

	$scope.new = function() {
		
		$scope.row = {
			EmployeeID : 0,
			FirstName : "",
			LastName : "",
			HomePhone : ""
		}
	}
	

}