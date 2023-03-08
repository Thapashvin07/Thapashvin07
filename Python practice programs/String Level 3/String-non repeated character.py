a=input()
for i in range(len(a)):
    for j in range(len(a)):
        if(a[i]==a[j] and j!=i):
            break
    else:
        print(a[i],end=" ")