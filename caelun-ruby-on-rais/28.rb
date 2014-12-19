def fala(idade)
	raise ArgumentError, "Idade negativa" unless idade > 0
end

fala(-1)
