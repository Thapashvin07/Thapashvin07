n = int(input())
a = []
for i in range(n):
    a.append(int(input()))
x=int(input())
for i in range(n):
    temp=x
    while(temp!=0):
        if(a[i]==temp%10):
            break
        temp//=10
    else:
        print("No")
        break
else:
    print("Yes")
