numeros = [1, 2, 3]

puts numeros.class

puts numeros.last
puts numeros.first

numeros << "Olá"
puts numeros


palavras = %w{ola mundo}
puts palavras

nome = "Johni"
palavras = %W{ola #{nome}}
p palavras
