c=0
n=int(input())
temp=n
while(temp!=0):
    temp//=10
    c+=1
print((n//(10**(c//2)))*(n%(10**(c//2))))