s=input()
ch=input()
if(s[0]!=ch):
    print(ch,end="")
print(s[:],end="")
if(ch!=s[len(s)-1]):
    print(ch)