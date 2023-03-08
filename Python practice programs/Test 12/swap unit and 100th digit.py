def swapUnitDigit(n):
    return((n%10)*10+(n//10))
m=int(input())
n=int(input())
if(m>n):
    print(swapUnitDigit(m)+n)
else:
    print(swapUnitDigit(n)+m)