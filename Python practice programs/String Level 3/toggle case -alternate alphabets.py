s=input()
i=0
while(i<len(s)):
    if(i%2==0):
        if(ord(s[i])>96):
            print(chr(ord(s[i])-32),end="")
        else:
            print(chr(ord(s[i])+32), end="")
    else:
        print(s[i],end="")
    i+=1