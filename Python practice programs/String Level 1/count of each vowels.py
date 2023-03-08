s=input()
a,e,ii,o,u=0,0,0,0,0
for i in range(len(s)):
    if(s[i]=='a'):
        a+=1
    elif(s[i]=='e'):
        e+=1
    elif(s[i]=='i'):
        ii+=1
    elif(s[i]=='o'):
        o+=1
    elif(s[i]=='u'):
        u+=1
print("a",a,"\ne",e,"\ni",ii,"\no",o,"\nu",u)