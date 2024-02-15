def calcular_media(numeros):
    if len(numeros) == 0:
        return 0  
    soma = sum(numeros)
    media = soma / len(numeros)
    return media

lista_de_numeros = [10, 15, 20, 25, 30]
media_resultante = calcular_media(lista_de_numeros)
print(f"A média dos números na lista é: {media_resultante}")
