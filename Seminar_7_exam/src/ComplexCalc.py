# Этот класс реализует интерфейс калькулятора для комплексных чисел
from InterfaceCalc import InterfaceCalc
from ComplexNumber import ComplexNumber

#TODO: Вопрос. Как лучше сделать? Передать в калькулятор комплексное число, или его коэффициенты. И что возвращать?

class ComplexCalc(InterfaceCalc):
    def __init__(self, a_real, a_imag, b_real, b_imag):
        self.x1 = a_real
        self.y1 = a_imag
        self.x2 = b_real
        self.y2 = b_imag
    
    def addition(self):
        result = (self.x1 + self.x2, self.y1 + self.y2)
        return result
    
    def substraction(self):
        result = (self.x1 - self.x2, self.y1 - self.y2)
        return result

    def multiplication(self):
        real = self.x1 * self.x2 - self.y1 * self.y2
        imagine = self.x1 * self.y2 + self.x2 * self.y1
        result = (real, imagine)
        return result
    
    def division(self):
        real = (self.x1 * self.x2 + self.y1 * self.y2) / (self.x2 * self.x2 + self.y2 * self.y2)
        imagine = ( - self.x1 * self.y2 + self.x2 * self.y1 ) / (self.x2 * self.x2 + self.y2 * self.y2)
        result = (real, imagine)
        return result


# compl1 = ComplexNumber()
# compl1.set_real(5)
# compl1.set_imagine(4)
# compl2 = ComplexNumber()
# compl2.set_real(1)
# compl2.set_imagine(5)

# c = ComplexCalc().addition
# print(compl1.get_complex())
# print(compl2.get_complex())
# print(compl3.get_complex())

print(ComplexCalc(1,-1,3,6).multiplication())

    
    