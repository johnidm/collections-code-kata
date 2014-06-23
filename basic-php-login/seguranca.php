<?php

if(empty($_SESSION)) // if the session not yet started 
   session_start();


function validaUsuario($usuario, $senha) {

	$nusuario = addslashes($usuario);
	$nsenha = addslashes($senha);


	//if (empty($resultado)) {	
	//return false;
	//} else {

	$_SESSION['usuarioID'] = 123; // Pega o valor da coluna 'id do registro encontrado no MySQL
	$_SESSION['usuarioNome'] = "Teste"; // Pega o valor da coluna 'nome' do registro encontrado no MySQL

	// Verifica a opção se sempre validar o login
	
	// Definimos dois valores na sessão com os dados do login
	$_SESSION['usuarioLogin'] = "teste";
	$_SESSION['usuarioSenha'] = "123456";
	

	return true;
}

/**
* Função que protege uma página
*/
function protegePagina() {
	

	if (!isset($_SESSION['usuarioID']) OR !isset($_SESSION['usuarioNome'])) {
	// Não há usuário logado, manda pra página de login
		expulsaVisitante();
	} 

}

	/**
* Função para expulsar um visitante
*/
function expulsaVisitante() {


// Remove as variáveis da sessão (caso elas existam)
	unset($_SESSION['usuarioID'], $_SESSION['usuarioNome'], $_SESSION['usuarioLogin'], $_SESSION['usuarioSenha']);

// Manda pra tela de login
	header("Location: login.php");
}

function logout() {

session_start();
unset($_SESSION["usuarioID"]); 
unset($_SESSION["usuarioNome"]); 
unset($_SESSION["usuarioLogin"]); 
unset($_SESSION["usuarioSenha"]); 

session_destroy(); // detroy it
header("location: login.php"); // vai para a pagina login.html

}


?>