s=input()
n=int(input())
for i in range(len(s)):
    if((i+1)%n!=0):
        print(s[i],end="")