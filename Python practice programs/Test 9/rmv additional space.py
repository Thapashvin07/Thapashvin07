s=input()
i=0
while(i<len(s)):
    print(s[i],end="")
    if(s[i]==' '):
        for j in range(i,len(s)):
            if(s[j+1]!=' ' or j+1==len(s)):
                break
        i=j
    i+=1