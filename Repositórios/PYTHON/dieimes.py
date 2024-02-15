import numpy as np

dieimes_matriz = np.array([[3, 4, 1], [3, 2, 1]])

total_sum = 0
for row in dieimes_matriz:
    for element in row:
        total_sum += element

print("A soma de todos os elementos da matriz é:", total_sum)
