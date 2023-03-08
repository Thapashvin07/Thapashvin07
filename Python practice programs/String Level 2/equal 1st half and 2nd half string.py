s=input()
if(len(s)%2==0):
    mid=len(s)//2
else:
    mid=(len(s)//2)+1
for i in range(len(s)//2):
    if(s[i]!=s[mid+i]):
        print("no")
        break
else:
    print("yes")