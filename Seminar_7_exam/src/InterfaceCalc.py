from abc import ABC, abstractmethod

class InterfaceCalc(ABC):
    
    @abstractmethod
    def input_number():
        pass
    
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
    
