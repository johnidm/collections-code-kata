class Autor:
    def __init__(self, nome):
        self.nome = nome
              
class Livro:
    def __init__(self, titulo, ano, autores):
        self.titulo = titulo
        self.ano = ano
        self.autores = autores
        
    def imprimir(self):
        print("Livro".center(12))
        print("{0} - {1}".format(self.titulo, self.ano))        
        print("Autores")        
        for autor in self.autores:
            print(autor.nome.rjust(10))


   
livro_1 = Livro("O rei Leao", 2014, [Autor("Fulano")])
livro_1.imprimir()

class AutorEspecial(Autor):
    def __init__(self, nome, bonus):
        Autor.__init__(self, nome)
        self.bonus = bonus

autor_1 = Autor("Ciclano")
print(autor_1.nome)

autor_2 = AutorEspecial("Beltrano", 20)
print("{0} tem um bonus de {1}".format(autor_2.nome, autor_2.bonus))



