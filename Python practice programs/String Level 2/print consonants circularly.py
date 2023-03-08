ch=input()
for i in range(25):
    if(not(ch=='a' or ch=='e'or ch=='i' or ch=='o' or ch=='u')):
        print(ch,end="")
    if(ch=='z'):
        ch='a'
    ch=chr(ord(ch)+1)