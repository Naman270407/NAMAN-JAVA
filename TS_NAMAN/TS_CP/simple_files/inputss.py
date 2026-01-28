# person = input("Enter names as much you want in string : ").split()
# print(f"Person names {person}")


# int input
# a, b = map(int, input("Enter two numbers: ").split())
# print("Sum =", a + b)



# Taking multiple inputs and storing in a list
# numbers = list(map(int, input("Enter numbers: ").split()))
# print("List =", numbers)


n = int(input())
for i in range(n-1,0,-1):
	if (i % 2 != 0):
		print(i,end=" ")
for j in range (1,n):
	if (j % 2 == 0):
		print(j, end=" ")
