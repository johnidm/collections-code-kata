<!DOCTYPE html>
<html>
<head>
	<title>Sample</title>
</head>
<body>


<?php

	if (isset($_POST['edit'])) {
		echo "<p>Edição de um registro</p>";
	}
	else if (isset($_POST['delete'])) {
		echo "<p>Exclusão de um registro</p>";
	}

?>

<form method="post">
 	<!-- ver como usar o label junto com input -->
	<label for="nome">Nome:</label>
	<input type="text" nome="nome" id="nome" tabindex="1">

		

	<input type="submit" name="edit"   value="Editar" title="Editar"> 
	<input type="submit" name="delete" value="Deletar" title="Excluir"> 

</form>	

</body>
</html>