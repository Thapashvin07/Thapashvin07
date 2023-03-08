n=int(input())
s=input()
count=1
for i in range(len(s)):
    if(ord(s[i])>96 and ord(s[i])<123 and count!=n):
        count+=1
        print(",",end="")
    else:
        print(s[i],end="")