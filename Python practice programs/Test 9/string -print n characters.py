a='acbd'
n=int(input())
for i in range(n):
    print(a[i%len(a)],end="")