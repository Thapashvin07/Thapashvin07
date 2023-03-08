s=input()
vowels=('a','e','i','o','u')
k=0
for i in range(len(s)):
    if (s[i] == 'a' or s[i] == 'e' or s[i] == 'i' or s[i] == 'o' or s[i] == 'u'):
        print(vowels[k%5],end="")
        k+=1
    else:
        print(s[i],end="")

