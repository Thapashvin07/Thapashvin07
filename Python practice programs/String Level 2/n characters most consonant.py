s=input()
n=int(input())
c1,c2=0,0
for i in range(n):
    if(not(s[i]=='a' or s[i]=='e'or s[i]=='i' or s[i]=='o' or s[i]=='u')):
        c1+=1
for i in range(len(s)-1,len(s)-n-1,-1):
    if(not(s[i]=='a' or s[i]=='e'or s[i]=='i' or s[i]=='o' or s[i]=='u')):
        c2+=1
if(c1>c2):
    print(s[:n])
elif(c1<c2):
    print(s[len(s)-n:len(s)])
else:
    print(s)
