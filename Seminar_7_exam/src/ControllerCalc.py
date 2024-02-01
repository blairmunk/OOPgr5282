
from ComplexNumber import ComplexNumber
from ComplexCalc import ComplexCalc
from ViewCalc import ViewCalc

class ControllerCalc:
    def __init__(self,view,calculator):
        self.view = view
        self.calc = calculator

    def check_num(self,num):
        try:
            string = input("Введите число: ")
            number = int(string)
            print(number)
        except ValueError:
            print("Ошибка! Невозможно преобразовать строку в число.")

    def run(self):
        self.view.prompt_msg("Это калькулятор комплексных чисел.")
        while True:
            a = ComplexNumber(0,0)
            b = ComplexNumber(0,0)
            self.view.prompt_msg("Вводим первое число.")    
            a.set_real(int(self.view.prompt_input("Действительная часть первого числа: ")))  
            a.set_imagine(self.view.prompt_input("Мнимая часть первого числа: "))
            self.view.prompt_msg("Вводим второе число.")    
            b.set_real(int(self.view.prompt_input("Действительная часть второго числа: ")))  
            b.set_imagine(self.view.prompt_input("Мнимая часть второго числа: "))

            self.calc.get_args(a.get_real(), a.get_imag_coef(), b.get_real(), b.get_imag_coef())

            while True:
                print("Поддерживаемые операции:")
                print("1. Сложение")
                print("2. Вычитание")
                print("3. Умножение")
                print("4. Деление")
                decision = self.view.prompt_input("Введите номер желаемой операции: ")
                if decision == '1':
                    x,y = self.calc.addition()
                    self.view.print_result(ComplexNumber(x,y))
                    break
                elif decision == '2':
                    x,y = self.calc.substraction()
                    self.view.print_result(ComplexNumber(x,y))
                    break
                elif decision == '3':
                    x,y = self.calc.multiplication()
                    self.view.print_result(ComplexNumber(x,y))
                    break
                elif decision == '4':
                    x,y = self.calc.division()
                    self.view.print_result(ComplexNumber(x,y))
                    break
                else: 
                    print("Введите корректный номер операции (от 1 до 4)\n")
                    continue
            
            self.view.prompt_msg("Посчитать еще? (д/н)")
            answer = input().lower()    
            if answer == 'д':
                continue
            else: 
                break


