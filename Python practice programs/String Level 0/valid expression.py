s=input()
for i in range(len(s)):
    if not((i%2==0 and s[i]=="H")or(i%2!=0 and s[i]=="T")):
        print("Invalid")
        break
else:
    print("Valid")