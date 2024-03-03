class Professor:
    def __init__(self, nome):
        self.nome = nome
        self.cursos = []

    def designar_curso(self, curso):
        if curso not in self.cursos:
            self.cursos.append(curso)
            curso.associar_professor(self)

    def listar_cursos(self):
        return [curso.nome for curso in self.cursos]

class Curso:
    def __init__(self, nome):
        self.nome = nome
        self.professor = None

    def associar_professor(self, professor):
        self.professor = professor

# Exemplo de uso:
professor1 = Professor("João")
professor2 = Professor("Maria")

curso1 = Curso("Matemática")
curso2 = Curso("História")

professor1.designar_curso(curso1)
professor1.designar_curso(curso2)
professor2.designar_curso(curso1)

print(f"Cursos lecionados por {professor1.nome}: {professor1.listar_cursos()}")
print(f"Cursos lecionados por {professor2.nome}: {professor2.listar_cursos()}")
