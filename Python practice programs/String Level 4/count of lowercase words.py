start=0
count=0
s=input()
for i in range(len(s)):
    if(i+1==len(s) or s[i]==" "):
        for j in range(start,i):
            if(ord(s[j])<96):
                break
        else:
            count+=1
        start=i+1
print(count)