def hrs(s):
    if(s[0]=='1'):
        return s[0:2]
    else:
        return s[0]
t1=input()
t2=input()
h1=int(hrs(t1))
h2=int(hrs(t2))
m1=int(t1[len(t1)-2:len(t1)])
m2=int(t2[len(t2)-2:len(t2)])
if(m2<m1):
    m2+=60
    h2=str(int(h2)-1)
print(int(h2)-int(h1),":",m2-m1)
