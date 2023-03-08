s=input()
if(ord(s[0])>96):
    print(chr(ord(s[0])-32),end="")
else:
    print(chr(ord(s[0])+32),end="")
i=1
while(i<len(s)):
    if(s[i]==' '):
        if(ord(s[i+1])<=96):
            print(s[i+1],end="")
        else:
            print(chr(ord(s[i+1])-32),end="")
        i+=1
    else:
        print(s[i],end="")
    i+=1