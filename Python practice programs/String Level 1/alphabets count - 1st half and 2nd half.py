s=input()
m,n=0,0
for i in range(len(s)):
    if(ord(s[i])>109):
        n+=1
    else:
        m+=1
if(m>n):
    print("firsthalf")
else:
    print("secondhalf")