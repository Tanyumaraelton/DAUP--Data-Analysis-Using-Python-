class Car:
    def __init__(self, make, model, year):
        self.make = make
        self.model = model
        self.year = year
        self.running = False 
    def start(self):
        if not self.running:
            self.running = True
            print(f"The {self.year} {self.make} {self.model} is starting.")
        else:
            print(f"The car is already running.")
    
    def stop(self):
        if self.running:
            self.running = False
            print(f"The {self.year} {self.make} {self.model} is stopping.")
        else:
            print(f"The car is already stopped.")


my_car = Car("Toyota", "Camry", 2020)
my_car.start()
my_car.stop()
