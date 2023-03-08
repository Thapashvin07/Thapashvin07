s=input()
a=s.split()
for i in range(1,len(a)):
    if(not(a[i][len(a[i])-1] == a[i-1][0] or a[i][len(a[i])-1] == chr(ord(a[i-1][0])-32) or a[i][len(a[i])-1] == chr(ord(a[i-1][0])+32))):
        print("no")
        break
else:
    print("yes")