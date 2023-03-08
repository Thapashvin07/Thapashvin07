s=input()
for i in range(len(s)-2):
    if(s[i]==s[i+1] and s[i]==s[i+2]):
        print("Invalid")
        break
else:
    print("Valid")