s1=input()
s2=input()
v_s1,v_s2=0,0
for i in range(len(s1)):
    if(s1[i]=='a' or s1[i]=='e' or s1[i]=='i' or s1[i]=='o' or s1[i]=='u'):
        v_s1+=1
for i in range(len(s2)):
    if(s2[i]=='a' or s2[i]=='e' or s2[i]=='i' or s2[i]=='o' or s2[i]=='u'):
        v_s2+=1
if(v_s1==v_s2):
    print(s1)
else:
    print("-1")