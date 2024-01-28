# Пришлось вводить интерфейс Shape, который имеет методы, общие для всех плоских фигур:
# назначения и получения размеров, вычисление площади. Без этого интерфейса наблюдались бы
# странности при установки ширины и длины квадрата. Поэтому и пришлось вводить абстрактный метод set_size.

# Так или иначе, всё-равно не очень понятно, удалось ли мне при этом учесть принцип LSP.

from abc import ABC, abstractmethod

class Shape(ABC):
    @abstractmethod
    def set_size():
        pass
    @abstractmethod
    def get_size():
        pass
    @abstractmethod
    def area():
        pass

class Rectangle(Shape):
    def __init__(self):
        self.width = 0
        self.height = 0

    def set_size(self, width, height):
        self.width = width
        self.height = height

    def get_size(self):
        return (f'width = {self.width}, height = {self.height}')
    
    def get_width(self):
        return self.width

    def get_height(self):
        return self.height

    def area(self):
        return self.width * self.height

class Square(Shape):
    def __init__(self):
        self.side = 0

    def set_size(self, side):
        self.side = side

    def get_side(self):
        return self.side

    def get_size(self):
        return (f'side = {self.side}')

    def area(self):
        return self.side ** 2
    
figure1 = Square()
print(figure1.get_size())
figure1.set_size(8)
print(figure1.get_size())
print(figure1.area())

figure2 = Rectangle()
print(figure2.get_size())
figure2.set_size(4,10)
print(figure2.get_size())
print(figure2.area())