x=int(input())
y=int(input())
temp=x
c=0
while(temp):
    c+=1
    temp//=10
divide=10**(c-1)
while(divide>=1):
    print(((x//divide)%10)*((y//divide)%10),end=" ")
    divide//=10