s=input()
for i in range(len(s)-1):
    for j in range(ord(s[i])+1,ord(s[i+1])):
        print(chr(j),end="")