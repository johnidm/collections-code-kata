import perguntas

print("Bem-vindo ao Quiz sobre Linguagens de Prgramação")
print("")
print("                              . .  ,  ,             ")
print("                              |` \/ \/ \,',         ")
print("                              ;          ` \/\,.    ")
print("                             :               ` \,/  ")
print("                             |                  /   ")
print("                             ;                 :    ")
print("                            :                  ;    ")
print("                            |      ,---.      /     ")
print("                           :     ,'     `,-._ \     ")
print("                           ;    (   o    \   `'     ")
print("                         _:      .      ,'  o ;     ")
print("                        /,.`      `.__,'`-.__,      ")
print("                        \_  _               \       ")
print("                       ,'  / `,          `.,'       ")
print("                 ___,'`-._ \_/ `,._        ;        ")
print("              __;_,'      `-.`-'./ `--.____)        ")
print("           ,-'           _,--\^-'                   ")
print("         ,:_____      ,-'     \                     ")
print("        (,'     `--.  \;-._    ;                    ")
print("        :    Y      `-/    `,  :                    ")
print("        :    :       :     /_;'                     ")
print("        :    :       |    :                         ")
print("         \    \      :    :                         ")
print("          `-._ `-.__, \    `.                       ")
print("             \   \  `. \     `.                     ")
print("           ,-;    \---)_\ ,','/                     ")
print("           \_ `---'--'\" '^ ;'                      ")
print("           (_`     ---'\"  ')                       ")
print("           / `--.__,. ,-'    \                      ")
print("          )-.__,-- ||___,--' `-.                    ")
print("          /._______,|__________,'\                  ")
print("          `--.____,'|_________,-'                   ")


indice = 0
acertos = 0
erros = 0

while True:
    # faz a pergunta    
    print("Pergunta")
    print (perguntas.perguntas[indice])
    for alternativa in perguntas.alternativas[indice]:
      print (alternativa)
    
    while True:        
        opcao = input("Digite a resposta ou x para sair -> ")

        if perguntas.valida_resposta(opcao):
          break
        
        print("")
        print("Opção \"%s\" inválida" % opcao)
        print("")        

    # verifica a resposta
    if perguntas.resposta_certa(opcao, perguntas.respostas[indice]):
      acertos += 1
      perguntas.imprime_respota(True)
    else:
      perguntas.imprime_respota(False)
      erros += 1
      
    if (opcao == "x" ):
        break

    indice += 1

    if indice == len(perguntas.perguntas):
      break

print("")
print("")
print("====== Resultado ======")
print("Total de erros %d" % erros)
print("Total de acertos %d" % acertos)

perguntas.percentual_acertos(len(perguntas.perguntas), acertos)
