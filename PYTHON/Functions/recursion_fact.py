def fact(n):
    if n<0:
        print ("not possible")
        return None
    elif n==0 or n==1:
        return 1
    else :
        ans= n*fact(n-1)
        return ans 

    num=5  
    result=fact(num)
    print(f"is{result}for{num}")