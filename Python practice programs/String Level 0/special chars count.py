s=input()
count=0
for i in range(len(s)):
    if not((ord(s[i])>96 and ord(s[i])<123) or (ord(s[i])>64 and ord(s[i])<92) or (ord(s[i])>47 and ord(s[i])<58)):
        count+=1
print(count)