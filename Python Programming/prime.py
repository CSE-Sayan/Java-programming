import math
store=[]

a=int(input("Enter the lower limit: "))
b=int(input("Enter the upper limit: "))
print("The prime numbers in the range are: ")
for number in range(a,b+1):
    if number > 1:
        for i in range(2,number):
            if(number%i)==0:
                break
        else:
            print(number)
            store.append(number)
        
print("The number of prime numbers are: ",len(store))
