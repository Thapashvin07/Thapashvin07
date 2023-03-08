s=input()
x=int(input())
for i in range(len(s)-x):
    print(s[i],end="")
for i in range(-1,-x-1,-1):
    print(s[i],end="")