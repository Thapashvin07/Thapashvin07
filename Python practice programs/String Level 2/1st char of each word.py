s=input()
print(s[0],end="")
for i in range(1,len(s)):
    if(s[i]==" "):
        print(s[i+1])