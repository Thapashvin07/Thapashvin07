n=int(input())
u_digit=n%10
if(u_digit==0):
    u_digit=10
i=u_digit
while(i<=n):
    print(i,"\t",end="")
    i+=u_digit