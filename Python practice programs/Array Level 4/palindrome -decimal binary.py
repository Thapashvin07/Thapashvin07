def isPalindrome(n):
    rev=0
    temp=n
    while(temp!=0):
        rev=rev*10+(temp%10)
        temp//=10
    if(rev==n):
        return 1
    else:
        return 0
sum=0
n=int(input())
a=[]
if(isPalindrome(n)==0):
    print("No")
else:
    temp=n
    while(temp!=0):
        a.append(temp%2)
        temp//=2
    # print(a)
    for i in range(len(a)-1,-1,-1):
        sum=sum*10+a[i]
    # print(sum)
    if(isPalindrome(sum)==0):
        print("no")
    else:
        print("yes")
