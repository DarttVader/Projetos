class Monitor:
    def __init__(self, marca, tamanho):
        self.marca = marca
        self.tamanho = tamanho

class Computador:
    def __init__(self, modelo):
        self.modelo = modelo
        self.monitor = None  # Inicialmente, o computador não possui um monitor conectado.

    def conectar_monitor(self, monitor):
        if not self.monitor:
            self.monitor = monitor
            print(f"Monitor {monitor.marca} de {monitor.tamanho} polegadas conectado ao computador {self.modelo}.")
        else:
            print(f"O computador {self.modelo} já possui um monitor conectado.")

    def desconectar_monitor(self):
        if self.monitor:
            print(f"Monitor {self.monitor.marca} de {self.monitor.tamanho} polegadas desconectado do computador {self.modelo}.")
            self.monitor = None
        else:
            print(f"O computador {self.modelo} não possui um monitor conectado.")

# Exemplo de uso:
monitor1 = Monitor("Dell", 24)
monitor2 = Monitor("Samsung", 27)

computador1 = Computador("HP")
computador2 = Computador("Lenovo")

computador1.conectar_monitor(monitor1)  # Conectando o monitor 1 ao computador 1
computador2.conectar_monitor(monitor2)  # Conectando o monitor 2 ao computador 2
computador1.conectar_monitor(monitor2)  # Tentando conectar o monitor 2 ao computador 1 (já tem um monitor)

computador1.desconectar_monitor()  # Desconectando o monitor do computador 1
computador2.desconectar_monitor()  # Desconectando o monitor do computador 2
