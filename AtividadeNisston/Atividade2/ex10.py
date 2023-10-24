class Funcionrio:

    #construtor
    #atributus 
    def __init__(self, nome, salario, cargo) -> None:
        self.nome = nome
        self.salario = salario
        self.cargo = cargo

    #metodo
    def aumento_Salarial(self):
        au = self.salario + (self.salario * 50)/100
        print(f'O funcionario {self.nome}, teve um aumento de 30% e seu salario passou a ser:  {au}')

f1 = Funcionrio("humberto", 1500, "Gerente")
f1.aumento_Salarial()