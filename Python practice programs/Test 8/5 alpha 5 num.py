s=input()
for i in range(0,len(s),5):
    if(i%2==0):
        for j in range(i,i+5):
            if(ord(s[j])>47 and ord(s[j])<58):
                break
        if(j<i+4):
            print("no")
            break
    else:
        for j in range(i,i+5):
            if(not(ord(s[j])>47 and ord(s[j])<58)):
                break
        if(j<i+4):
            print("no")
            break
else:
    print("yes")
