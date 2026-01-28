# 1. Read a number and check if it is divisible by 7. 

# n = int(input())
# if(n%7 == 0):
#     print("yes")
# else:
#     print("No")
# ____________________________________________________________________________


# 2. WAP to check if the last digit is 4. 

# n = int(input())
# n = abs(n)
# if (n % 10 == 4):
#     print("Yes")
# else:
#     print("No")
# ___________________________________________________________________________


# 3. WAP to check if the number is divisible by 3 and the last digit is 4. 

# n = int(input())
# n = abs(n)
# if (n % 3 == 0 and n % 10 == 4):
#     print("YEs")
# else:
#     print("No")
# ___________________________________________________________________________


# 4. WAP to check if the number is divisible by 7 or if the last digit is 5. 

# n = int(input())
# if ( n % 7 == 0 or n % 10 == 5):
#     print("Yes")
# else:
#     print("No")
# ___________________________________________________________________________


# 5. Take an integer A as input. You have to tell whether A is divisible by both 5 and 11 or not.
 
# A = int(input())
# if (A % 5 == 0 and A % 11 == 0):
#     print("Yes")
# else:
#     print("No")
# ___________________________________________________________________________


# 6. Read three integers and print their maximum. 

# a = int(input()) 
# b = int(input()) 
# c = int(input()) 
# if a >= b and a >= c: 
#    print("maximum = ", a) 
# elif b >= c: 
#    print("maximum  = ", b) 
# else: 
#    print("maximum = ", c) 
# ___________________________________________________________________________


# 7. Read three angles of triangles and determine their types(Right triangle, Obtuse 
# triangle, Acute triangle).

# a = int(input()) 
# b = int(input()) 
# c = int(input())
# sum = a+b+c
# if (a>0 and b>0 and c>0 and sum == 180):
#     if (a == 90 or b == 90 or c == 90):
#         print("right angle triangle")
#     elif (a > 90 or b > 90 or c > 90):
#         print("Obtuse triangle")
#     else:
#         print("Acute triangle")
# else:
#     ("Invalid triangle")
# ___________________________________________________________________________



# 8. WAP to check whether a person is eligible to vote or not. 

# n = int(input())
# if n >= 18:
#     print("Yes")
# else:
#     print("No")
# ___________________________________________________________________________

# 9. WAP to check whether a year is a leap year or not. 

# n = int(input())
# if (n % 400 == 0 or (n % 4 == 0 and n % 100 != 0)):
#     print("Yes")
# else:
#     print("No")
# ___________________________________________________________________________


# 10. WAP to accept a number from 1 to 7 and display the name of the day, like 1 for 
# Sunday, 2 for Monday, etc. 

# n = int(input())
# if (n == 1):
#     print("Sunday")
# elif (n == 2):
#     print("Monday")
# elif (n == 3):
#     print("Tuesday")
# elif (n == 4):
#     print("Wednesday")
# elif (n == 5):
#     print("Thrusday")
# elif (n == 6):
#     print("Friday")
# elif (n == 7):
#     print("Saturday")
# else:
#     print("Invalid day")
# ___________________________________________________________________________

# 11. Given 5 numbers A, B, C, D, E as input. Print the average of these 5 numbers. 

# a = int(input()) 
# b = int(input()) 
# c = int(input())
# d = int(input()) 
# e = int(input())
# avg = (a+b+c+d+e)/5
# print(avg)
# ___________________________________________________________________________


# 12. You are given 3 integer angles(in degrees), A, B, and C, of a triangle. You have to tell 
# whether the triangle is valid or not. A triangle is valid if the sum of its angles equals 
# 180. 

# a = int(input()) 
# b = int(input()) 
# c = int(input())
# if (a>0 and b>0 and c>0 and a+b+c==180):
#     print("Yes")
# else:
#     print("No")
# ___________________________________________________________________________


# 13. Write a program to input two numbers(A & B) from the user and print the maximum 
# element among A & B.

# a = int(input()) 
# b = int(input())
# if a>b:
#     print(a)
# else:
#     print(b)
# ___________________________________________________________________________


#14. Write a program to input three numbers(A, B & C) from the user and print the 
# minimum element among A, B & C. 

# a = int(input()) 
# b = int(input()) 
# c = int(input()) 
# if a <= b and a <= c: 
#    print("minimum = ", a) 
# elif b <= c: 
#    print("minimum  = ", b) 
# else: 
#    print("minimum = ", c) 
# ___________________________________________________________________________


# 15. Accept the percentage from the user and display the grade according to the following 
# criteria. 
# ● 
# Below 25 – D 
# ● 
# 25 to 45 – C 
# ● 
# 45 to 65 – B 
# ● 
# 65 to 85 – A 
# ● 
# Above 85 – A+

n = int(input("Enter percentage: "))
if (0 <= n <=100):
    if n < 25:
        print("D") 
    elif 25 <= n < 45: 
        print("C") 
    elif 45 <= n < 65: 
        print("B") 
    elif 65 <= n < 85: 
        print("A") 
    else: 
        print("A+")
else:
    print("Invalid percentage")
