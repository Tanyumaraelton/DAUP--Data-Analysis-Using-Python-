ynum=int(input("enter number:"))
if num<=1:
    print("not a prime")
else:
    for i in range(2,int (num**0.5)+1):
        if num%i==0:
            print ("NOt prime")
        else :
            print ("prime")   



        
        
