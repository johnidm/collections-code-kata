numeros = [1, 2, 3, 4]

numeros.each { |numero| p numero }

numeros_ao_quadrado = numeros.collect { | numero | numero ** 3 }
puts numeros_ao_quadrado

