s1=input()
s2=input()
for i in range(len(s1)):
    if(s1[i]=='a' or s1[i]=='e' or s1[i]=='i' or s1[i]=='o' or s1[i]=='u'):
        for j in range(len(s2)):
            if(s1[i]==s2[j]):
                print(s1[i],end="")
                break
