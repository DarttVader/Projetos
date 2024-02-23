class estudante:
    def __init__(self, nome, idade):
        self.nome = nome
        self.idade = idade
    
    def texto(self):
        print(f'O seu nome {self.nome} e sua idade {self.idade}') 
