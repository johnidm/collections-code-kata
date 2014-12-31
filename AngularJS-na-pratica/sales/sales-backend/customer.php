<?php

$app->get("/customers", function() {



	$sql = "SELECT CustomerID, ContactName, Phone FROM customers";
	
	$smtp = DB::prepare($sql);	

	$smtp->execute();

	formatJSON($smtp->fetchAll());
});


$app->get("/customer/:id", function($id) {

	$sql = "SELECT CustomerID, ContactName, Phone FROM customers where CustomerID = ? ";
	
	$smtp = DB::prepare($sql);

	$smtp->execute(array($id));

	formatJSON($smtp->fetch());
});

$app->post("/customer/:id", function($id) {


	$data = json_decode(\Slim\Slim::getInstance()->request()->getBody());
	
	if ($data->isUpdate)
	{
		$sql = "UPDATE customers set ContactName=?, Phone=? where CustomerID=?";		
		$smtp = DB::prepare($sql);

		$smtp->execute(array(
			$data->ContactName,
			$data->Phone,
			$data->CustomerID)
		);

	} else 
	{
		$sql = "INSERT INTO customers(ContactName, Phone, CustomerID) VALUES(?, ?, ?)";

		$smtp = DB::prepare($sql);

		$smtp->execute(array(
			$data->ContactName,
			$data->Phone,
			$data->CustomerID)
		);		
	}
	
	formatJSON($data);
	
});



$app->delete("/customer/:id", function() {

	$sql = "DELETE FROM customers where CustomerID = ? ";
	
	$smtp = DB::prepare($sql);

	$smtp->execute(array($id));

	formatJSON(true);
});
