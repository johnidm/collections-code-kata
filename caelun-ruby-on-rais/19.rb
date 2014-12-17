def meu_metodo
	puts "chamandos boloco associado"
	yield
end

meu_metodo { puts "bloco chamado" }

