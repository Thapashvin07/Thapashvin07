n1=int(input())
n2=int(input())
val1=n1%10
val2=n1//10
if((n2%10==val1 or n2%10==val2)or(n2//10==val1 or n2//10==val2)):
    print("Valid")
else:
    print("Invalid")
