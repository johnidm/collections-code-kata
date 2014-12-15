arquivo = io.open("arquivo.txt", "w")

for i = 0, 200 do
  arquivo:write(i .. '\n')
end

arquivo.close()


arquivo = io.open("arquivo.txt", "r")

soma = 0
for valor in arquivo:lines() do
  print(valor)
  soma = soma + tonumber(valor)
end



arquivo.close()

print("A soma é .. " .. soma )
