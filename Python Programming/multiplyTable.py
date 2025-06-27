number=int(input("enter the number of which you want to print the multiplication table: "))
print("The multiplication table of: ",number)
for count in range(1,11):
    print(number,'x',count,'=',number*count)