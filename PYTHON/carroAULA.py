class Carro:
    pneus = 4 

    def __init__(self, marca, modelo):
        self.marca = marca
        self.modelo = modelo
    
carro1 = Carro("Ford", "Fiesta")
carro2 = Carro("Honda", "Civic")

print(carro1.pneus)  
print(carro2.pneus) 

print(Carro)

  