num1= int(input("first:"))
num3= int(input("Third:"))
num2= int(input("Second:"))

if num1>=num2 and num1>=num3:
    greatest =num1
elif num2>=num1 and num2>=num3:
    greatest =num2
else:
    greatest = num3

print("greatest is",greatest)

