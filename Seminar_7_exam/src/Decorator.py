from InterfaceCalc import InterfaceCalc
from ComplexCalc import ComplexCalc
class Logger:  
    def log(self,line): 
        print(line) 

class Decorator(InterfaceCalc):
    def __init__(self,logger):
        self.calc = ComplexCalc()
        self.logger = logger
    
    def get_args(self,x1,y1,x2,y2):
        self.logger.log(f"\nПринимаем аргументы {x1},{y1},{x2},{y2}")
        result = self.calc.get_args(x1,y1,x2,y2)
        self.logger.log("Аргументы приняты\n")
        return result

    def addition(self):
        self.logger.log("\nВыполняем сложение ...")
        result = self.calc.addition()
        self.logger.log(f"Сложение выполнено с результатом {result}\n")
        return result

    def substraction(self):
        self.logger.log("\nВыполняем вычитание ...")
        result = self.calc.substraction()
        self.logger.log(f"Вычитание выполнено с результатом {result}\n")
        return result

    def multiplication(self):
        self.logger.log("\nВыполняем умножение ...")
        result = self.calc.multiplication()
        self.logger.log(f"Умножение выполнено с результатом {result}\n")
        return result

    def division(self):
        self.logger.log("\nВыполняем деление ...")
        result = self.calc.division()
        self.logger.log(f"Деление выполнено с результатом {result}\n")
        return result
