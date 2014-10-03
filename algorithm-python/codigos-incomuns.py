import math

# Inicializando uma lista

lista_inteiros = [1] * 10
print(lista_inteiros)

lista_literais = ["Ola"] * 5
print(lista_literais)

# Repetindo caracteres

texto_cifrado = "#" * 5
print(texto_cifrado)

texto_escondido = "@#%*" * 5
print(texto_escondido)

#Operador ternário
# Extrai todas as vogais de uma string
texto = "O rato roeu a roupa, do rei de Roma. E a rainha, de raiva, roeu o resto."
vogais = ""
for letra in texto:
    vogais += letra if letra in ["a", "e", "i", "o", "u"] else ""

print("O total de vogias da da frase é %d - %s" % (len(vogais), vogais))


#inverter uma string

print("Bom dia"[::-1])
nome = "Fulano"
print(nome[::-1])


#List comprehensions

# Quadrado de elementos de uma lista
numeros = [1, 2, 3, 7]

quadrado = [ math.pow(x, 2) for x in numeros ]
print(quadrado)

dobro = [ x * 2 for x in numeros ]
print(dobro)

# tamanho das strings de uma lista
nomes = ["Astrojildo", "Fulano", "Baucelino", "Felisberto", ]
tamanho_nomes = [ len(nome) for nome in nomes ]
print(tamanho_nomes)

nomes_tamanho_maio_10 = [ nome for nome in nomes if len(nome) >= 10 ]
print(nomes_tamanho_maio_10)

#






