def fib(n):
    if n<=0:
     return "invalid"
    elif n==1:
     return 0

    else:
       a,b=0,1
        
       for i in range(2,n):
       
        a,b=b,a+b
       return b
    
n=int(input("enter number"))
print (f"s {fib(n)}" )    






