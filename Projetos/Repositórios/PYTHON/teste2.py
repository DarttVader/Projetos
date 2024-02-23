nome = input("digite seu nome ")
sobrenome = input("digite seu sobrenome ") 
idade = int(input("digite sua idade "))
altura = float(input("digite sua altura "))
peso = float(input("digite seu peso "))

maior_idade = idade >= 18

print("\nResultado ")
print("nome ",nome)
print("sobrenome ",sobrenome)
print("idade ",idade)
print("altura ",altura)
print("peso ",peso)
print("maior de idade ", "Sim" if maior_idade else "Não")

