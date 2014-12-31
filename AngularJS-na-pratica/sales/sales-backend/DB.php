<?php

class DB {

	private static $instance;
	private static $connection;

	private function __construct() {
		
		self::$connection = new PDO("mysql:host=" . DB_HOST . ";dbname=" . DB_NAME, DB_USER, DB_PASSWORD, array(PDO::MYSQL_ATTR_INIT_COMMAND => 'SET NAMES utf8'));

		self::$connection->setAttribute(PDO::ATTR_ERRMODE, PDO::ERRMODE_EXCEPTION);
		self::$connection->setAttribute(PDO::ATTR_DEFAULT_FETCH_MODE, PDO::FETCH_OBJ);
		
	}	

	public static function getInstance() {
		if (empty(self::$instance)) {
			self::$instance = new DB();
		}

		return self::$instance;
	}

	public static function getConn() {
		self::getInstance();		
		return self::$connection;
	}

	public static function prepare($sql) {
		return self::getConn()->prepare($sql);
	}

	public static function lastInsertId() {
		return self::getConn()->lastInsertId();
	}

	public static function beginTransaction() {
		return self::getConn()->commit() ;
	}

	public static function rollBack() {
		return self::getConn()->rollBack() ;	
	}

	public static function dateToMySQL($date) {
		return implode("-", array_reverse(explode("/", $date)));
	}
	
	public static function dateFrommySQL($date) {
		return implode("/", array_reverse(explode("-", $date)));
	}
	

}
