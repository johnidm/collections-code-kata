a = {}
b = {}

io.write("Bem vindo ao meu programa")

for i = 0, 3, 1 do
  io.write("Informe o valor do indice :" .. i)
  a[i] = io.read("*number")
end

for i = 0, 3, 1 do
  b[i] = a[i] * 3
end

for i = 0, 3, 1 do
  io.write("posicao " .. i ..  " valor de a " .. a[i] .. "valor de b " .. b[i])
end



