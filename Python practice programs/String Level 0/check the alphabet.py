s=input()
x=int(input())
for i in range(len(s)):
    if(chr(x+96)==s[i]):
        print("yes")
        break
else:
    print("no")