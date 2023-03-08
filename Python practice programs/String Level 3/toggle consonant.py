def toggleWord(s):
    if(ord(s)>96):
        return chr(ord(s)-32)
    else:
        return chr(ord(s)+32)
s=input()
a=list(s)
for i in range(len(s)):
    if(a[i]=='a' or a[i]=='e' or a[i]=='i' or a[i]=='o' or a[i]=='u'):
        for j in range(i+1,len(s)):
            if(not(a[j]=='a' or a[j]=='e' or a[j]=='i' or a[j]=='o' or a[j]=='u')):
                a[j]=toggleWord(a[j])
                break
s1=""
print(s1.join(a))