n=int(input())
rev=(n%10)*10+n//10
if(n<rev):
    print(n)
else:
    print(rev)
