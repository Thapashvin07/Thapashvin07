ch=input()
if(ch=='z'):
    i='a'
elif(ch=='Z'):
    i='A'
else:
    i=chr(ord(ch)+1)
if(ord(ch)>96):
    while(ord(i)!=0):
        if(not(i=='a' or i=='e' or i=='i' or i=='o' or i=='u')):
            print(i)
            break
        if(i=='z'):
            i=='a'
        else:
            i=chr(ord(i)+1)
else:
    while (ord(i) != 0):
        if (not (i == 'A' or i == 'E' or i == 'I' or i == 'O' or i == 'U')):
            print(i)
            break
        if (i == 'Z'):
            i == 'A'
        else:
            i = chr(ord(i) + 1)