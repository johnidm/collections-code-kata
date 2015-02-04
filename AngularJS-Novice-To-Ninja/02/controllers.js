


angular.module('myApp.controllers', []).		
	controller('SiteController', function ($scope) {
		$scope.publisher = 'SitePoint';
		$scope.type = 'Web Development';
		$scope.name = 'Scope for SiteController';

});

angular.module('myApp.controllers').	
	controller('BookController', function ($scope) {

		$scope.wishListCount = 0;

		$scope.books = ['Jump Start HTML5', 'Junp Start CSS', 'Jump Start Responsive Web Design'];
		$scope.name = 'Scope for BookController';

		$scope.addToWishList=function(book) {
			$scope.wishListCount++;
		};

		$scope.$watch('wishListCount', function(newValue, oldValue) {
			console.log('called ' + newValue + ' times');
			if (newValue == 20) {
				alert("Great! You have 2 items in your wish list.")	;
			}
		});



});


