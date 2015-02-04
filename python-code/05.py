import os

print(os.getcwd())
os.chdir("a")
print(os.getcwd())
os.chdir("..")
print(os.getcwd())

#os.mkdir("teste")
#os.chdir("teste")
#print(os.getcwd())

#os.mkedirs("a/b/c")
#os.chdir("a/b/c")
#print(os.getcwd())

#os.rename("teste", "tt")

#os.rmdir("tt")

print(os.listdir(".."))



