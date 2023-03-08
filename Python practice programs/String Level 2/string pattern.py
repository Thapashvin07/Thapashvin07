s=input()
for i in range(len(s)):
    for j in range(ord(s[i])-96):
        print(s[i],end="")
    print()