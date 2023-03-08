s=input()
for i in range(len(s)):
    count=0
    for j in range(i,len(s)):
        if(not(s[j]=='a'or s[j]=='e' or s[j]=='i' or s[j]=='o' or s[j]=='u')):
            count+=1
    print(count,end=" ")