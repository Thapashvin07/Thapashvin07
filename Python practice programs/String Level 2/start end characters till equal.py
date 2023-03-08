s=input()
for i in range(len(s)//2):
    print(s[i]+s[len(s)-1-i],end="")
    if(s[i]==s[len(s)-1-i]):
        break
