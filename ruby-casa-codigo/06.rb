nome = "Johni"

puts nome.upcase!
puts nome


valor = nil
numero = "dois"

if numero == "num" then valor = 1
elsif numero == "dois" then valor = 2
else valor = 3
end

p valor 

valor = if numero == "um" then 1
			elsif numero == "dois" then 2
			else 3	
		end

puts valor

a = b = c = 0

p a, b, c

numeros = [1, 2, 3, 4]

novos_numeros = for n in numeros 
	n * 2
end

p novos_numeros




		

