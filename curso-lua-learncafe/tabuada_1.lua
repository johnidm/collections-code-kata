io.write("Tabuda: ") 
io.write("Entre com uma numero: ") n = io.read("*number")

i = 1
repeat
  r = n * i
  io.write(string.format("%2d", n))
  
  io.write( "X ")

  io.write(string.format("%2d", i))

  io.write(" = ")

  io.write(string.format("%3d", r))

  i = i + 1
until (i > 10)


  
  




