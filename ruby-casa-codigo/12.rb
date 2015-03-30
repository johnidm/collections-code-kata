require File.expand_path("library")

require 'yaml'


tdd = Livro.new "TDD", "Mauricio Aniche", "123456", 247, 69.9, :testes
web_design = Livro.new "Design Responsivo", "Tarcio Zemel", "654321", 247, 58.9, :web_design

objeto_serializado = YAML.dump tdd

p objeto_serializado

outro_objeto = YAML.load objeto_serializado
p outro_objeto