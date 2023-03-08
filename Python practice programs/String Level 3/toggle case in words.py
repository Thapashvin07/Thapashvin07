def toggle(s):
    if(ord(s[0])>96):
        for i in range(len(s)):
            if(s[i]==" "):
                print(" ",end="")
            else:
                print(chr(ord(s[i])-32),end="")
    else:
        for i in range(len(s)):
            if(s[i]==" "):
                print(" ",end="")
            else:
                print(chr(ord(s[i])+32),end="")
s=input()
start=0
for i in range(len(s)):
    flag_a,flag_A=0,0
    if(i+1==len(s) or s[i]==" "):
        for j in range(start,i):
            if(ord(s[j])>96):
                flag_a=1
            else:
                flag_A=1
        if(flag_a==1 and flag_A==1):
            print(s[start:i+1],end="")
        else:
            toggle(s[start:i+1])
        start=i+1