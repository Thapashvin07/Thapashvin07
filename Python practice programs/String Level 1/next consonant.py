ch=input()
if(ch>chr(96)):
    for i in range(ord(ch)+1,ord('z')+1):
        if (not(chr(i) == 'a' or chr(i) == 'e' or chr(i) == 'i' or chr(i) == 'o' or chr(i) == 'u')):
            print(chr(i))
            break
else:
    for i in range(ord(ch)+1,ord('Z')+1):
        if (not(chr(i) == 'A' or chr(i) == 'E' or chr(i) == 'I' or chr(i) == 'O' or chr(i) == 'U')):
            print(chr(i))
            break