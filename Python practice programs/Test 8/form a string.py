n=int(input())
x=int(input())
s=[]
s.append(chr(x+96))
s1=('a','b','c')
for i in range(n-1):
    s.append(s1[i%3])
print(s[:])