def valida_resposta(resposta):
    return resposta in ["a", "b", "c", "d", "e", "x"]

def converte_resposta(resposta_digitada):
  if resposta_digitada == "a":
    return 0
  elif resposta_digitada == "b":   
    return 1
  elif resposta_digitada == "c":   
    return 2
  elif resposta_digitada == "d":   
    return 3
  elif resposta_digitada == "e":   
    return 4
    
def resposta_certa(resposta_digitada, resposta ):
  return converte_resposta(resposta_digitada) == resposta
    
def imprime_respota(acerto):
  print("")
  if acerto:
    print("Parabéns você acertou.")
  else:
    print("Que pena! Você errou.") 
  print("")

def percentual_acertos(total_perguntas, total_acertos):
  print("%2.0f%% e o seu indice de acertos" % ((total_acertos * 100) / total_perguntas) )


perguntas = [
  "É uma forma de criar um objeto em Java",
  "É uma etapa do processo de compilacao",
  "É considerada uma linguagem de programacao de baixo nivel"]

alternativas = [ ["a) Objeto:= Objeto.Create();", "b) Objeto objeto = new Objeto.Create();", "c) Objeto objeto = new Objeto();"],
                 ["a) Analise Formal", "b) Analise Semantica", "c) Analise Tecnica"],
                 ["a) Pascal", "b) C++", "c) Assembly"]]

respostas = [1, 1, 2]
