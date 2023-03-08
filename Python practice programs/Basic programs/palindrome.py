n=int(input())
rev=0
temp=n
while(temp):
    rev=rev*10+(temp%10)
    temp//=10
if(rev==n):
    print(n,"is a palindrome")
else:
    print(n,"is not a palindrome")