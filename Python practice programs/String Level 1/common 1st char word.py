s=input()
i=0
while(i<len(s)):
    if(s[i]==s[0]):
        for j in range(i,len(s)):
            print(s[j], end="")
            if(s[j]==' '):
                break
    else:
        for j in range(i,len(s)):
            if(s[j]==' '):
                break
    i=j+1