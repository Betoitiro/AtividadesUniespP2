Vetor = [5, 4, 7, 0, 1, 2, 8, 9, 10, 3, 6]

n = len(Vetor)

for i in range(n - 1):  # Alterado para range(n - 1)
    for j in range(0, n - i - 1):
        if Vetor[j] > Vetor[j + 1]:
            # Trocar os elementos se estiverem fora de ordem
            Vetor[j], Vetor[j + 1] = Vetor[j + 1], Vetor[j]
print(Vetor)
