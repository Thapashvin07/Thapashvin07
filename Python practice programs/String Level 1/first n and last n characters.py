s=input()
n=int(input())
print(s[:n],end="")
for i in range(len(s)-n,len(s)):
    print(s[i],end="")