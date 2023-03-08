s=input()
y,n=0,0
for i in range(len(s)):
    if(s[i]=='y'):
        y+=1
    else:
        n+=1
if(y>n):
    print("yes")
elif(y<n):
    print("no")
else:
    print("equal")
