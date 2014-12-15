a = {}

for i = 0, 1, 1 do
  a[i] = {}

  for j = 0, 3, 1 do 
    a[i][j] = 333  
  end
end


for i = 0, 1, 1 do
  for j = 0, 3, 1 do
    print("coluna " .. i ..  " linha " .. j .. " valor ",  a[i][j] )
  end
end
