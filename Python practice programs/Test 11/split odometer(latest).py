def splitOdo(s):
    rem=s
    if(int(rem)%10!=9):
        rem=rem[0:2]+str((int(rem)%10)+1)
    else:
        if((int(rem)//10)%10!=9):
            rem=rem[0]+str((int(rem)%100)+1)
        else:
            if(int(rem)//100!=9):
                rem=str(int(rem)+1)
            else:
                rem="000"
    return rem
s=input()
k=int(input())
a=s
for i in range(k):
    temp=a
    j=0
    a=""
    while(j<len(temp)):
        rem=temp[j:j+3]
        a+=splitOdo(rem)
        j+=3
    print(a)
