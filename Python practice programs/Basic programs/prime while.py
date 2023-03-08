n=int(input())
i=2
while(i<=n//2):
    if(n%i==0):
        print(n,"is not prime")
        break;
    i+=1
else:
    print(n,"is prime")