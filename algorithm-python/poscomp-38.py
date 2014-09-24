


def is_rest( number, resp ):
    return number % resp == 0



A=12
B=25
C=96
D=15

resp = 1
index = 2

while True:
    print("111")

    if (is_rest(A, index) or is_rest(B, index) or is_rest(C, index) or is_rest(D, index)):

        resp = resp * index

        if (is_rest(A, index)):
            A /=  index

        if (is_rest(B, index)):
            B /=  index

        if (is_rest(C, index)):
            C /=  index

        if (is_rest(D, index)):
            D /=  index
        
    else:
        index +=1          
    

    if (A == 1) and (B == 1) and (C == 1) and (D == 1):
        break

print ("Resposta ", resp)

