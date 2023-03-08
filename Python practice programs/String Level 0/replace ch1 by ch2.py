s=input()
ch1=input()
ch2=input()
for i in range(len(s)):
    if(s[i]==ch1):
        print(ch2,end="")
    else:
        print(s[i],end="")