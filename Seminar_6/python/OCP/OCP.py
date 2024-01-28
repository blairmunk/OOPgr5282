# Созданы два новых класса Car и Bus, наследники Vehicle. Поле type больше не нужно, убрал.
class SpeedCalculation:
    def calculate_allowed_speed(self, vehicle):
        return vehicle.calculate_allowed_speed()

class Vehicle:
    def __init__(self, max_speed):
        self.max_speed = max_speed

    def get_max_speed(self):
        return self.max_speed

    def calculate_allowed_speed(self):
        return 0.0

class Car(Vehicle):
    def calculate_allowed_speed(self):
        return self.get_max_speed() * 0.8

class Bus(Vehicle):
    def calculate_allowed_speed(self):
        return self.get_max_speed() * 0.6

vehicle_1 = Car(100)
vehicle_2 = Bus(100)
print(vehicle_1.calculate_allowed_speed())
print(vehicle_2.calculate_allowed_speed())