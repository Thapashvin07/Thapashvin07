n=int(input())
for i in range(2,n//2+1):
    if(n%i==0):
        break
if(i==n//2+1 or n%2==0):
    print("Valid")
else:
    print("Invalid")