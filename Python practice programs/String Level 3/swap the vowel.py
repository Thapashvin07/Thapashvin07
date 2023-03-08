s1=input()
s2=input()
pos=0
a=list(s1)
b=list(s2)
for i in range(len(a)):
    if(a[i]=='a' or a[i]=='e' or a[i]=='i' or a[i]=='o' or a[i]=='u'):
        for j in range(pos,len(b)):
            if(b[j]=='a' or b[j]=='e' or b[j]=='i' or b[j]=='o' or b[j]=='u'):
                temp=a[i]
                a[i]=b[j]
                b[j]=temp
                pos = j + 1
                break
print(a)
print(b)