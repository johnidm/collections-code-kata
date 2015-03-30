<?php

use PHPUnit_Framework_TestCase as PHPUnit;
use library\Fale;

class FaleTest extends PHPUnit
{    
    protected $fale;

    public function testOla()
    {        
        $this->assertEquals("Olá", $this->fale->ola());
    }

    public function testOlaComNome()
    {        
        $this->assertEquals("Olá Johni", $this->fale->ola("Johni"));
        $this->assertEquals("Olá Cristian", $this->fale->ola("Cristian"));
        $this->assertEquals("Olá Eduard", $this->fale->ola("Eduard"));
    }

    public function setUp() {
        $this->fale = new Fale();
    } 
    
}