ch1=input()
ch2=input()
count=0
for i in range(ord(ch1),ord(ch2)+1):
    if(not(chr(i)=='a' or chr(i)=='e' or chr(i)=='i' or chr(i)=='o' or chr(i)=='u')):
        count+=1
print(count)