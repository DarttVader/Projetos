class Cabeça:
    def __init__(self, cor_olhos, cor_cabelo):
        self.cor_olhos = cor_olhos
        self.cor_cabelo = cor_cabelo

    def __str__(self):
        return f"Cabeça com olhos de cor {self.cor_olhos} e cabelo de cor {self.cor_cabelo}"

class Boneco:
    def __init__(self, nome, cor_cabeça, cor_olhos):
        self.nome = nome
        self.cabeça = Cabeça(cor_olhos, cor_cabeça)

    def destruir(self):
        del self  # Simplesmente excluindo o objeto Boneco

# Exemplo de uso:
boneco1 = Boneco("Boneco1", "marrom", "azul")
print(f"{boneco1.nome} tem uma {boneco1.cabeça}.")
boneco1.destruir()  # Destrói o boneco
# Se o boneco for destruído, sua cabeça também será.

# Tentar acessar a cabeça após destruir o boneco causará um erro, pois o objeto boneco não existe mais.
# print(f"Tentando acessar a cabeça de {boneco1.nome}: {boneco1.cabeça}")
