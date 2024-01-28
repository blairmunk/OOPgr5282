# Добавлен интерфейс EngineControl, в котором имеется метод start, 
# реализация которого зависит от конкретного двигателя.
# Создал две экзмепляра Car с разными двигателями, чтобы проверить работоспособность кода

from abc import ABC, abstractmethod

class Car:
    def __init__(self, engine):
        self.engine = engine
    
    def start(self):
        self.engine.start()

class EngineControl(ABC):
    @abstractmethod
    def start(self):
        pass

class PetrolEngine(EngineControl):
    def start(self):
        print("Petrol engine is starting...")

class DieselEngine(EngineControl):
    def start(self):
        print("Diesel engine is starting...")

car_1 = Car(PetrolEngine())
car_1.start()
car_2 = Car(DieselEngine())
car_2.start()
