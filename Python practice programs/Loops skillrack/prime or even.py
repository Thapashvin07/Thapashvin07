n=int(input())
i=2
while(i<=n//2):
    if(n%i==0):
        break
    i+=1
if(i==n//2+1 or n%2==0):
    print("Valid")
else:
    print("Invalid")