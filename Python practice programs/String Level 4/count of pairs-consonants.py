def isconsonant(s):
    if(not(s=='a' or s=='e' or s=='i' or s=='o' or s=='u')):
        return 1
    else:
        return 0
count=0
s=input()
for i in range(len(s)-1):
    if(isconsonant(s[i])==1 and isconsonant(s[i+1])==1):
        count+=1
print(count)
