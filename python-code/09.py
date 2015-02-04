import os.path

caminho='home/user/johni'

print(os.path.abspath(caminho))

print(os.path.basename(caminho))
print(os.path.dirname(caminho))
print(os.path.split(caminho))
print(os.path.splitext('arquivo.johni.txt'))
print(os.path.splitdrive(caminho))


print(os.path.join("c", "dados", "arquivos"))


