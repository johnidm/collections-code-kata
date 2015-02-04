import os
import sys

for raiz, diretorios, arquivos in os.walk(".."):
	print("\nDiretorio", raiz)
	for d in diretorios:
		print("  %s/" % d)
	for f in arquivos:
		print("  %s/" % f)

	print("%d diretorio(s)", "%d arquivo(s)" % (len(diretorios), len(arquivos)) )