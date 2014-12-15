io.write("Quantas horas trabalhadas?") 

ht = io.read("*number")

io.write("Qual é o valor da hora?") 

vh = io.read("*number")

io.write("Qual é o percentual de desconto?") 

pd = io.read("*number")

sb = ht * vh

td = (pd / 100) * sb

sl = sb - td

io.write("Salario bruto.....")
io.write(string.format("%7.2f", sb), "n")

io.write("Desconto..........");
io.write(string.format("%7.2f", td), "n")

io.write("Salario liquido....");
io.write(string.format("%7.2f", sl), "n")
