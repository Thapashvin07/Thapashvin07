avg=float(input())
if(avg>90):
    print("O")
elif(avg<=90 and avg>80):
    print("A+ Grade")
elif(avg<=80 and avg>70):
    print("A Grade")
elif(avg<=70 and avg>60):
    print("B+ Grade")
elif(avg<=60 and avg>50):
    print("B Grade")
else:
    print("Better luck next time!")