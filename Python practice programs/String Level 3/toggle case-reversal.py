s=input()
x=int(input())
for i in range(x-1,-1,-1):
    if(ord(s[i])>96):
        print(chr(ord(s[i])-32),end="")
    else:
        print(chr(ord(s[i])+32), end="")