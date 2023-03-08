s=input()
for i in range(len(s)):
    if(len(s)%(i+1)==0):
        print(s[i],end="")