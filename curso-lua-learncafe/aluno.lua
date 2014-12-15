aluno = {
  nome, 
  notas = {}
}

print("Cadastro de alunos........")
print("")

io.write("Informe o nome")
aluno.nome = io.read()

for i=0, 2, 1 do
  io.write("Informe a nota: ")
  aluno.notas[i] = io.read("*number")
end


print("Aluno - " .. aluno.nome)
for i=0, 2, 1 do
  print("Nota " .. i .. aluno.notas[i])


end




