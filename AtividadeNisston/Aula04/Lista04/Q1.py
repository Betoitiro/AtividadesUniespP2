Vetor = [5, 4, 7, 0, 1, 2, 8, 9, 10, 3, 6]
#criar um vetor com numeros de maneira desordenadas-
n = len(Vetor)
#crirar uma variavel para que leia a quantidade de elementos que tenham dentro do vetor

for i in range(n - 1):  #loop for usando a quantidade de elementos -1 para o sistema execulte a quantidade de vezes que atribua todos os elementos
    for j in range(0, n - i - 1): #segundo for para que diminua a quantidaded e vezes que o programa vai se repetir 
        if Vetor[j] > Vetor[j + 1]: #conficção caso J seja maior que J + 1
            # variavel para que possa udar a sequencia do
            Vetor[j], Vetor[j + 1] = Vetor[j + 1], Vetor[j]
print(Vetor)
