from Bio.Blast import NCBIWWW

fasta_string = open('seq.fa').read()

result_handle = NCBIWWW.qblast('blastn', 'nt', fasta_string)

from Bio.Blast import NCBIXML

blast_record = NCBIXML.read(result_handle)

# print(len(blast_record.alignments))

E_VALUE_THRESH = 0.01

for alignment in blast_record.alignments:
    for hsp in alignment.hsps:
        if hsp.expect < E_VALUE_THRESH:
            print("**** Alignment****")
            print("Sequence: ", alignment.title)
            print("Length: ", alignment.length)
            print("Value: ", hsp.expect)

            print(hsp.query)
            print(hsp.match)
            print(hsp.sbjct)
