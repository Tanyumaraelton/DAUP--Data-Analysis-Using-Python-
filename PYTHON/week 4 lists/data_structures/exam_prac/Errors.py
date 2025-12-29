try:
    x=int(input("enter value 1"))
    y=int(input("value 2"))

    ans=x/y
    print(f"the answer is {ans}")
except ZeroDivisionError:
    print("u can not divide with 0")
except ValueError:
    print("there was an error")

