a = 2.3
print(a)

b = nil
if (b == nil) then
	print("b e nulo")
end

c = 4
print(c)

d = 5.2
print(d)

e = "Johni"
print(e)

f = "Johni D` Agua"
print (f)

g = 'Johni D\' '
print(g)

h = [[O rato 
roeu a ropa do 
de roma]]

print(h)

i = {}
print(i)

aa = 21
if (aa == 2) then	
	print("aa = 2")
elseif (aa == 0) then
	print("aa = 0")
else
	print("aa = " .. aa)
end

ii = 0
while (ii <= 2) do
	ii = ii + 1
	print(ii)
end

oo = 0
repeat 
	oo = oo + 1
	print(oo)
until oo == 2


for zz = 0, 10 do
	print(zz)
end

for zz = 0, 10, 2 do
	print(zz)
end

a = {"one", "two"}
for i in pairs(a) do
	print(a[i])
end

for i, k in pairs(a) do
	print(i)
	print(k)

	print(i, k)
end

for i = 1,2 do
	print(a[i])
end

for i = 1, #a do
	print(">>" .. a[i])
end























