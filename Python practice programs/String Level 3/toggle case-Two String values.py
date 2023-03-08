s1=input()
s2=input()
for i in range(len(s1)):
    if(s2[i]=='u' or s2[i]=='U'):
        if(ord(s1[i])<97):
            print(s1[i],end="")
        else:
            print(chr(ord(s1[i])-32),end="")
    else:
        if(ord(s1[i])>96):
            print(s1[i],end="")
        else:
            print(chr(ord(s1[i])+32),end="")