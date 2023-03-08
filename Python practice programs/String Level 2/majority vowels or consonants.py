s=input()
v,c=0,0
for i in range(len(s)):
    if(s[i]=='a' or s[i]=='e'or s[i]=='i' or s[i]=='o' or s[i]=='u'):
        v+=1
    else:
        c+=1
if(v>c):
    for i in range(len(s)):
        if (s[i] == 'a' or s[i] == 'e' or s[i] == 'i' or s[i] == 'o' or s[i] == 'u'):
            print(s[i],end="")
elif(c>v):
    for i in range(len(s)):
        if (not(s[i] == 'a' or s[i] == 'e' or s[i] == 'i' or s[i] == 'o' or s[i] == 'u')):
            print(s[i],end="")
else:
    print(s)