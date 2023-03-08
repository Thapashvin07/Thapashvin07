s=input()
x=int(input())
for i in range(len(s)-1,-1,-1):
    if((i+1)%x==0):
        print(s[i],end="")