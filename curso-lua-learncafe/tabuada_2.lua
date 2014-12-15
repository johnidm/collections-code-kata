io.write("Tabuda: ") 
io.write("Entre com uma numero: ") n = io.read("*number")


for i = 1, 10, 1 do
  r = n * i
  io.write(string.format("%2d", n))
  
  io.write( "X ")

  io.write(string.format("%2d", i))

  io.write(" = ")

  io.write(string.format("%3d", r))

  i = i + 1
end



  
  




