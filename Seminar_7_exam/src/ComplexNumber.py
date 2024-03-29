
class ComplexNumber:
    '''
    Этот класс для комплексных чисел.
    '''
    def __init__(self,real,imagine):
        self.real = real
        self.imagine = imagine

    def get_real(self):
        return self.real
    
    def set_real(self, real):
        self.real = real
    
    def get_imag_coef(self):
        return self.imagine

    # Мнимую часть можно вводить как в виде коэффциента, так и полностью (15, 8i, -11i)
    def set_imagine(self, imagine):
        self.imagine = int(str(imagine).strip('i'))

    # Метод для косметически красивого вывода мнимой части
    def get_imag_part(self):
        if self.imagine > 0:
            return f"+ {self.imagine}i"
        elif self.imagine < 0:
            return f"- {abs(self.imagine)}i"
        else: return ""

    # Возвращает строчку с комплексным числом вида x + yi
    def get_number(self):
        return (f'{self.real} {ComplexNumber.get_imag_part(self)}').rstrip()


    
    
