n=int(input())
u_digit=n%10
if(u_digit==0):
    u_digit=10
for i in range(u_digit,n+1,u_digit):
    print(i,end=" ")
