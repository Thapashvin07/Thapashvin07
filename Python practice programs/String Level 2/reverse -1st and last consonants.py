s=input()
i=0
j=len(s)-1
while(i<len(s)):
    if(not(s[i]=='a' or s[i]=='e' or s[i]=='i' or s[i]=='o' or s[i]=='u')):
        break
    i+=1
while(j>=0):
    if(not(s[j]=='a' or s[j]=='e' or s[j]=='i' or s[j]=='o' or s[j]=='u')):
        break
    j-=1
print(s[:i]+s[j:i-1:-1]+s[j+1:])
