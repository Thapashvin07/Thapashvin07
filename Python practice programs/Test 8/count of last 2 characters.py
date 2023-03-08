count=0
s=input()
for i in range(len(s)-1):
    if(s[i]==s[len(s)-2] and s[i+1]==s[len(s)-1]):
        count+=1
print(count)