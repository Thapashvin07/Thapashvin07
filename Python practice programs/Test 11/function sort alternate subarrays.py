def sortAlt(size,a,k):
    for i in range(0,len(a),2*k):
        for j in range(i,i+k):
            for l in range(j+1,i+k):
                if(a[j]>a[l]):
                    temp=a[j]
                    a[j]=a[l]
                    a[l]=temp
n=int(input())
a=[]
for i in range(n):
    a.append(int(input()))
k=int(input())
sortAlt(n,a,k)
print(a)