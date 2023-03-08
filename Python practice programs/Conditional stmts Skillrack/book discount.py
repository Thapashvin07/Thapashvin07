x=int(input())
y=int(input())
if(x>=2 and x<=4):
    total=(x*y*10)/100
elif(x==5):
    total=(x*y*5)/100
elif(x>5):
    total=(x*y*50)/100
else:
    total=x*y
print("{:.2f}".format(x*y-total))