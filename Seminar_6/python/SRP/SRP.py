# Необходимо было переписать код в соответствии с принципом SRP. Выделен отдельный класс AccountService, 
# который реализует метод calculate_net_salary. Также в класс Employee добавлен геттер зарплаты
from datetime import date
class Employee:

    def init(self, name, dob, base_salary):
        self.name = name
        self.dob = dob
        self.base_salary = base_salary

    def get_emp_info(self):
        return f"name - {self.name} , dob - {self.dob}"

    def get_salary_info(self):
        return base_salary

class AccountService:
    @staticmethod
    def calculate_net_salary(base_salary):
        tax = int(base_salary * 0.25) # рассчитать налог другим способом
        return base_salary - tax
