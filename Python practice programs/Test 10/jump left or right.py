x=int(input())
y=int(input())
k=int(input())
jump=0
for i in range(k):
    if(i%2==0):
        jump+=x
    else:
        jump-=y
print(jump)