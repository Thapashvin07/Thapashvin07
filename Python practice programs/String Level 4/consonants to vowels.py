s=input()
for i in range(len(s)):
    if(not(s[i]=='a' or s[i]=='e' or s[i]=='i' or s[i]=='o' or s[i]=='u')):
        for j in range(i+1,len(s)):
            if(s[j]=='a' or s[j]=='e' or s[j]=='i' or s[j]=='o' or s[j]=='u'):
                print(s[j],end="")
                break
        else:
            break
    else:
        print(s[i],end="")