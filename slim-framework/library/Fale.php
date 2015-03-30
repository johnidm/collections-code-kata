<?php

namespace library;

class Fale {

	public function ola() {

		if (func_num_args() === 1)
			return "Olá " . func_get_arg (0);
		else 
		  	return "Olá";
	}

}
