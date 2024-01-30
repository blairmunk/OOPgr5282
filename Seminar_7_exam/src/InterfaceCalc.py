from abc import ABC, abstractmethod

class InterfaceCalc(ABC):
    '''
    Интерфейс для калькулятора. 
    Заложены функции сложения, вычитания, умножения и деления
    '''

    @abstractmethod
    def addition():
        pass
    
    @abstractmethod
    def substraction():
        pass
    
    @abstractmethod
    def multiplication():
        pass
    
    @abstractmethod
    def division():
        pass
    
