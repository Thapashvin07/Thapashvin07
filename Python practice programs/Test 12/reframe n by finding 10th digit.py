n=int(input())
x=int(input())
rem=n%100
sum=0
while(rem!=0):
    sum+=rem%10
    rem//=10
print((n//10)*100+((x-sum)*10+n%10))
