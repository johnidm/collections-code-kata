<?php

use PHPUnit_Framework_TestCase as PHPUnit;
use library\Primeiro;

class PrimeiroTeste extends PHPUnit
{    

	protected $primeiro;

    public function testVerdadeiro()
    {        
        $this->assertEquals(2, 1 + 1);
    }

    public function testFalha()
    {        
        $this->assertEquals(1, 1 * 1);
    }

    public function testDigaOla()
    {        
        $this->assertEquals("Olá", $this->primeiro->digaOla());
    }

    public function setUp() {
    	$this->primeiro = new Primeiro();
    }

    public function tearDown() { }
    
}