s=input()
i=0
while(i<len(s)):
    if(s[i]=="#"):
        for j in range(i+1,len(s)):
            if(s[j]=="#"):
                break
        if(j<len(s)-1):
            for k in range(i+1,j):
                print(s[k],end="")
            i=j
        else:
            break
    else:
        i+=1