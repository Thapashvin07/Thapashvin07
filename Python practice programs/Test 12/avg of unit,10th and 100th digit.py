n=int(input())
print("{:.2f}".format(((n%10)+((n//10)%10)+(n//100)%10)/3))