s=input()
max=0
for i in range(len(s)):
    count=0
    for j in range(i+1,len(s)):
        if(s[i]==s[j]):
            count+=1
    if(count>max):
        max=count
print(max+1)