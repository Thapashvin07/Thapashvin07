s=input()
c=0
for i in range(len(s)):
    if(s[i]=='I'):
        c+=1
    elif(s[i]=='R'):
        c=0
    else:
        c-=1
print(c)