n=int(input())
a=[]
for i in range(n):
    a.append(int(input()))
for i in range(len(a)):
    print(chr(a[i]+96),end="")