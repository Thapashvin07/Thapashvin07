p=int(input())
if(p<=1000):
    discount=(p*10)/100
elif(p>1000):
    discount=100+((p-1000)*5)/100
print("{:.2f}".format(discount))