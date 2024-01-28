# Добавлен интерфейс Solid для объемных фигур. Он содержит метод volume,
# этот метод теперь должен реализовывать только класс Cube, 
# интерфейс добавлен через множественное наследование

from abc import ABC, abstractmethod
import math

class Shape(ABC):
    @abstractmethod

    def area(self):
        pass

class Solid(ABC):
    @abstractmethod

    def volume(self):
        pass

class Circle(Shape):
    def __init__(self, radius):
        self.radius = radius

    def area(self):
        return 2 * math.pi * self.radius

class Cube(Shape, Solid):
    def __init__(self, edge):
        self.edge = edge

    def area(self):
        return 6 * self.edge * self.edge

    def volume(self):
        return self.edge * self.edge * self.edge  

circle_1 = Circle(1)
cube_1 = Cube(2)
print(circle_1.area())
print(cube_1.area())
print(cube_1.volume())