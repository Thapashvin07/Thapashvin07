n=int(input())
five=n//5
rem=n%5
two=rem//2
one=rem%2
if(five!=0):
    print("Count of five:",five)
if(two!=0):
    print("Count of two:",two)
if(one!=0):
    print("Count of one:",one)