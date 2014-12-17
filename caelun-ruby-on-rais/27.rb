print "Digite um número"
n = gets.to_i

begin
	resultado = 100 / n

rescue
	puts "Numero digitado é inválido"
	exit
end

puts "100/#{n} é #{resultado}"

