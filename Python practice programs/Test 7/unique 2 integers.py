n=int(input())
a=[]
for i in range(n):
    a.append(int(input()))
for i in range(0,len(a)-1,2):
    if(a[i]==a[i+1]):
        print("no")
        break
else:
    print("yes")