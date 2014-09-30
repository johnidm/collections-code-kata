import random

palavras = ["casa", "morango"]

print("| Bem vindo ao jogo da forca |".center(40, "-"))
print()
print()
print()

palavra = palavras[random.randrange(len(palavras))].lower()
palavra_exibir = " * " * (len(palavra))

digitadas = []
acertos = 0
erros = 0

while True: 

    print("- {0} -".format(palavra_exibir))

    while True:
        letra_digitada = input("Digite a letra --> ")
                
        if len(letra_digitada) != 1:
            print("Você deve digitar uma letra")
        elif letra_digitada in digitadas:
            print("Você já digitou a letra {0}".format(letra_digitada))
        else:
            break

    digitadas.append(letra_digitada)
    
    if letra_digitada in palavra:
        print("Você acertou a letra {0}".format(letra_digitada))
        acertos += 1
    else:
        print("Você errou a letra {0}".format(letra_digitada))
        erros += 1

    palavra_exibir = ""
    for letra in palavra:
        palavra_exibir += " {0} ".format( letra if letra in digitadas else "*" )
    
        
    if (palavra_exibir.replace("*", "").replace(" ", "") == palavra) :
        print("Parabens você acertou a palavra {}".format(palavra))
        break

    if erros == 6:
        print("Que pena você não tem mais tentativas")
        print("A palavra é \"%s\"" % palavra)
        break
    
          


    

