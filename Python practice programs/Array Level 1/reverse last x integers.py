n=int(input())
x=int(input())
a=[]
for i in range(n):
    a.append(int(input()))
print(a[-1:-x-1:-1])