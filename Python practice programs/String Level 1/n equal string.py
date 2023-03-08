s=input()
n=int(input())
if(len(s)%n!=0):
    print("-1")
else:
    for i in range(0,len(s),len(s)//n):
        print(s[i:i+len(s)//n],end=" ")