io.write("Entre com a 1 nota: ") n1 = io.read("*number")
io.write("Entre com a 2 nota: ") n2 = io.read("*number")

md = (n1 + n2) / 2

if (md > 5) then
  io.write("Aprovado")
elseif (md == 5) then
  io.write("Exame")
else 
  io.write("Reprovado")
end

print(string.format("%5.2f", md))

