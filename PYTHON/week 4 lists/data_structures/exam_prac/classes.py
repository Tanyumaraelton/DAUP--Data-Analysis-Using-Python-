class car:
    def __init__(self,make,model,name):
        self.make=make
        self.model=model
        self.name=name

    def start(self):
        print(f"{self.name} {self.model} {self.make} was started")
    def end(self):
            print(f"{self.model}{self.name}{self.make} has ended")

    car1= car ("toyota","caravan"," nissan")


    car1.start()
    car1.stop()




    