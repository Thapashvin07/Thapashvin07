s=input()
for i in range(len(s)):
    if(s[i]=='*'):
        if(not(s[i-1]==s[i+1])):
            print("no")
            break
else:
    print("yes")