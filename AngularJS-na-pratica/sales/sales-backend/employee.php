<?php

$app->get("/employees", function() {

	$sql = "SELECT EmployeeID, FirstName, LastName, HomePhone FROM employees";

	$smtp = DB::propare($sql);

	$smtp->execute();

	formatJSON($smtp->fetchAll());
});


$app->get("/employee/:id", function($id) {

	$sql = "SELECT EmployeeID, FirstName, LastName, HomePhone FROM employees WHERE EmployeeID=?";
	
	$smtp = DB::propare($sql);

	$smtp->execute(array($id));

	formatJSON($smtp->fetch());
});

$app->post("/employee/", function() {

	$data = json_decode(\Slim\Slim::getInstance()->request()->getBody());

	if ($data->EmployeeID != 0)
	{		
		$sql = "UPDATE employees set FirstName = ?, LastName = ?, HomePhone = ? WHERE EmployeeID=?";
		
		$smtp = DB::propare($sql);

		$smtp->execute(array(
			$data->FirstName,
			$data->LastName,
			$data->HomePhone,
			$data->EmployeeID)
		);	

	} else 
	{
		$sql = "INSERT INTO employees(FirstName, LastName, HomePhone) VALUES(?, ?, ?)";
		
		$smtp = DB::propare($sql);

		$smtp->execute(array(
			$data->FirstName,
			$data->LastName,
			$data->HomePhone)
		);
		$data->EmployeeID = DB::lastInsertID;	
	}
	
	formatJSON($data);
	
});



$app->delete("/employee/:id", function($id) {

	$sql = "DELETE FROM employees WHERE CustomerID = ? ";
	
	$smtp = DB::propare($sql);

	$smtp->execute(array($id));

	formatJSON(true);
});
