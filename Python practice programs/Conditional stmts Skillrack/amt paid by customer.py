x=int(input())
y=int(input())
z=int(input())
if(x==y and y==z):
    price=x+y+z
elif(x==y):
    price=x+y+z-((2*x*10)/100)
elif(y==z):
    price=x+y+z-((2*y*10)/100)
elif(z==x):
    price=x+y+z-((2*x*10)/100)
else:
    price=x+y+z
print("{:.2f}".format(price))