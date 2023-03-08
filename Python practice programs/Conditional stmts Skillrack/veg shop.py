a=int(input())
b=int(input())
c=int(input())
d=int(input())
x=int(input())
amt=a+(b*2)+(c*5)+(d*10)
if(amt==x):
    print("Paid")
elif(amt>x):
    print("Paid",amt-x)
else:
    print("Not paid",amt)
