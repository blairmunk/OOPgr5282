from ControllerCalc import ControllerCalc
from Decorator import Decorator,Logger
from ComplexCalc import ComplexCalc
from ViewCalc import ViewCalc


view = ViewCalc()
logger = Logger()
print("Использовать логгер? (д/н)")
if input().lower() in {"y","д","yes","да"}:
    calc = Decorator(logger)
else: 
    calc = ComplexCalc()

ControllerCalc(view,calc).run()