s1=input()
s2=input()
max=0
count=0
for i in range(len(s1)):
    if(s1[i]==s2[i]):
       count+=1
    else:
        if(count>max):
            max=count
            start=i-count
            count=0
if(max<count):
    max=count
    start=i-count
print(s1[start:start+max])