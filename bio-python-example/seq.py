from Bio.Seq import Seq
from Bio.Alphabet import generic_protein, generic_rna, generic_dna

fasta_string = open('my_seq.fa').read()

my_protein = Seq(fasta_string)

print(my_protein.translate())
