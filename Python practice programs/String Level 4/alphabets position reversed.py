n=int(input())
a=[]
for i in range(n):
    a.append(input())
for i in range(len(a)-1,-1,-1):
    if(ord(a[i])<96):
        print(ord(a[i])-64, end=" ")
    else:
        print(ord(a[i])-96,end=" ")