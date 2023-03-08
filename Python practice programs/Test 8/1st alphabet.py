s=input()
min=s[0]
for i in range(1,len(s)):
    if(ord(s[i])<ord(min)):
        min=s[i]
print(min)