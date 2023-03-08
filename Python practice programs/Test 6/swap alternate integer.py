n=int(input())
a=[]
for i in range(n):
    a.append(int(input()))
for i in range(0,len(a),3):
    temp=a[i]
    a[i]=a[i+2]
    a[i+2]=temp
print(a[:len(a)])