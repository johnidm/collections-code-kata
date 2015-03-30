

idade = 27
nome = "Johni"

if (idade > 18)
	puts nome
end

puts nome if idade > 18


caixa = nil
puts caixa.class

nome = nil
puts "Seja bem vindo #{nome}" if not nome.nil?
puts "Seja bem vindo #{nome}" unless nome.nil?
puts "Seja bem vindo #{nome}" if nome

for numero in (1..10) 
	puts "Numero: #{numero}"
end


numero = 1
while numero <= 10
	puts "Número: #{numero}"
	numero += 1
end

numero = 1
until numero == 10
	puts "Número: #{numero}"
	numero += 1
end

#texto = %{Isso é "normal" e 'util'}
#texto = %?Isso é "normal"[] e 'util'?
texto = %{Isso é "normal" {ola} e 'util'}
texto = %{Isso é "normal" e

 'util'}
puts texto


