s=input()
#a,e,i,o,u=0,0,0,0,0
flag_a=0
flag_e=0
flag_i=0
flag_o=0
flag_u=0
for i in range(len(s)):
    if(s[i]=='a'):
        flag_a=1
    elif(s[i]=='e'):
        flag_e=1
    elif(s[i]=='i'):
        flag_i=1
    elif(s[i]=='o'):
        flag_o=1
    elif(s[i]=='u'):
        flag_u=1
if flag_a==1 and flag_e==1 and flag_i==1 and flag_o==1 and flag_u==1:
    print("yes")
else:
    print("no")