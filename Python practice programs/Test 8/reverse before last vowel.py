s=input()
for i in range(len(s)-1,-1,-1):
    if(s[i]=='a' or s[i]=='e' or s[i]=='i' or s[i]=='o' or s[i]=='u'):
        break
for j in range(i-1,-1,-1):
    print(s[j],end="")
for j in range(i,len(s)):
    print(s[j],end="")