s1=input()
s2=input()
c1,c2=0,0
for i in range(len(s1)):
    if(not(s1[i]=='a' or s1[i]=='e' or s1[i]=='i' or s1[i]=='o' or s1[i]=='u')):
        c1+=1
for i in range(len(s2)):
    if(not(s1[i]=='a' or s1[i]=='e' or s1[i]=='i' or s1[i]=='o' or s1[i]=='u')):
        c2+=1
if(c1>c2):
    print(s1)
elif(c1<c2):
    print(s2)
else:
    if(len(s1)>len(s2)):
        print(s1)
    else:
        print(s2)