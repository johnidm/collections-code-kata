from random import randrange
from random import shuffle
 
lista_aluno = ['fulano', 'ciclano', 'beltrano']
lista_lp = ['PHP', 'Java', 'Python']
 
print "------| Linguagens de programacao"
 
shuffle(lista_lp)
print lista_lp
 
print "-_----| Lista alunos"
 
shuffle(lista_aluno)
print lista_aluno
 
print ""
print ""
print ""
 
index = randrange(0,len(lista_aluno))
 
for (lp,aluno) in zip(range(len(lista_lp)), lista_aluno):
    print 'Linguagem Programacao: ', lista_lp[lp - index] ," ", aluno
 
print "Final"
- See more at: http://www.johnidouglas.com.br/sortition-in-two-lists-algorithm-in-python/#sthash.ZOrG0bqI.dpuf
