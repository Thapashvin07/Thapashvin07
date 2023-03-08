s=input()
ch='a'
for i in range(26):
    j=0
    while(j<len(s)):
        if(s[j]==ch):
            break
        j+=1
    else:
        print(ch,end="")
    ch = chr(ord(ch) + 1)