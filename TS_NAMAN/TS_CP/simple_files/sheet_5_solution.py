#  1.Sum of list
#  Given an array compute the sum of all elements.
#  Input : A=[1 2 3 4 5]           Output: 15

# n = int(input())
# list1 = []
# sum = 0
# for i in range(0,n):
#     list1.append(int(input()))
# for j in list1:
#     sum = sum + j      
# print("The sum is:",sum)  

#         or or or 

# a = list(map(int, input().split())) 
# b = sum(a) 
# print(b) 

#          or or or 

# a = list(map(int, input().split())) 
# b = 0 
# for i in a: 
#     b = b + i
# print(b) 
# -------------------------------------------------------------------


#  2.Copy the Array
#  You are given a constant array A and an integer B.
#  You are required to return another array where Arr[i] = A[i] + B.
#  Input: A=[1 2 3 2 1]      B=3       Output:[4 5 6 5 4]

# A = list(map(int, input().split()))
# B = int(input("Input the number which you want to add : "))
# C =[]
# for i in A :
#     C.append(B+i)
# print(C)
# -------------------------------------------------------------------


#  3.Max and Min of an Array
#  Take input an array A of size N and write a program to print maximum and minimum
#  elements of the input array .Here N represents the length of the array .
#  Input :  A=[1 2 3 4 5]        Output:  5 1


# l = list(map(int, input().split()))
# print(max(l))
# print(min(l))

#          or or or

# a = list(map(int, input().split())) 
# mn = a[0] 
# mx = a[0] 
# for i in a: 
#    if i < mn: 
#        mn = i 
#    if i > mx: 
#        mx = i
# print("max:", mx) 
# print("min:", mn)
# -------------------------------------------------------------------


#  4.Search Element
#  You are given array A and an integer B. You have to tell whether B is present in array A
#  or not.   Input: A=[1 5 9 1]       B=5          Output:1

# l = list(map(int, input().split()))
# n = int(input("Enter search element : "))
# count = 0
# for i in l:
#     if i == n:
#         count = count + 1
# print("only present times = ", count)
# -------------------------------------------------------------------



# 5.Negative Integers 
# Write a program to print all negative numbers from input array A of size N. 
# Input:-  A = [1 -5 2 -8 -4]       Output: -5 -8 -4 

# l = list(map(int, input().split()))
# for i in l:
#     if (i < 0):
#         print(i, end=" ")
# -------------------------------------------------------------------


#   6.Even Odd Elements 
# For array A, you have to find the value of absolute difference between the counts of 
# even and odd elements in the array. 
# Array A diya h, usme jitne even (जोड़ संख्या) elements h aur jitne odd (विषम संख्या)
#  elements h un dono ki ginti ka difference nikalna hai — 
# aur wo difference hamesha positive hona chahiye (absolute difference).
# Input: A = [1 2 3 4]       Output: 0   


# l = list(map(int, input().split()))
# count_even = 0
# count_odd = 0
# absolute_difference = 0
# for i in l:
#     if (i % 2==0):
#         count_even += 1
#     else:
#         count_odd += 1
# absolute_difference = count_even - count_odd
# print(abs(absolute_difference))
# -------------------------------------------------------------------


 
# 7.Separate Odd Even 
# You are given an integer array A. 
# You have to print the odd and even elements of array A in 2 separate lines. 
# Input: A = [1 2 3 4 5]       Output: 1 3 5      2 4 

# l = list(map(int, input().split())) 
# even = [] 
# odd = [] 
# for i in l: 
#    if (i%2==0): 
#       even.append(i) 
#    else: 
#       odd.append(i) 
# print("Even numbers:", even) 
# print("Odd numbers:", odd) 
# -------------------------------------------------------------------


# 8.Square of Array 
# You are provided with an integer array A. Return another array B of size same as that of 
# A such that B[i] = A[i]^2 
# Input: A=[2, 6, 8, 1]         Output: [4, 36, 64, 1] 

# l = list(map(int, input().split()))
# b = []
# for i in l:
#     b.append(i*i)
# print(b)
# -------------------------------------------------------------------


# 9.Cube of Array 
# You are provided with an integer array A. Return another array B of size same as that of 
# A such that B[i] = A[i]^3 
# Input: A=[2, 6, 8, 1]       Output: [8, 216, 512, 1] 

# l = list(map(int, input().split()))
# b = []
# for i in l:
#     b.append(i**3)
# print(b)
# -------------------------------------------------------------------


 
# 10.Reverse 
# Given an array A, Find the reverse of it. (Solve this question with for loop) 
# Input:  A = [3, 5, 1, 2, 1, 2] 
# Output:  [2, 1, 2, 1, 5, 3] 

# l = list(map(int, input().split()))
# l.reverse()
# print(l)

#     or or or

# l = list(map(int, input().split()))
# b =[]
# for i in range (len(l)-1,-1,-1):
#     b.append(l[i])
# print(b)
# -------------------------------------------------------------------


# 11. Add two list element: 
# Given two lists A1 and A2, each containing integers, write a Python program to compute 
# the element-wise sum of the corresponding elements in the two lists and store the result 
# in a new list. 
# Input: 
# A1=[1, 2, 3,4] 
# A2=[4, 5, 6,7] 
# Output: 
# [5, 7, 9, 11] 

# a = list(map(int, input().split()))
# b = list(map(int, input().split()))
# c = []
# for i in range (0,len(a)):
#     c.append(a[i]+b[i])
# print(c)
# -------------------------------------------------------------------


# 12. Find the output : 

# list = list(map(int, input().split()))
# print(list[:]) 
# print(list[::]) 
# print(list[2:5]) 
# print(list[2:]) 
# print(list[2::]) 
# print(list[:2]) 
# print(list[::2]) 
# print(list[1::2]) 
# print(list[2:10:2])
# -------------------------------------------------------------------


# 13. Find the output : 

# list = list(map(int, input().split()))
# print(len(list)) 
# print(list[-2 :-5: -1]) 
# print(list[-2:]) 
# print(list[-2::]) 
# print(list[:-2]) 
# print(list[::-2]) 
# print(list[::-1])
# -------------------------------------------------------------------


# 15. Find the output : 

# s= "Hello everyone how are you" 
# print(s.split()) 
# s = "Hello-everyone-how are you" 
# print(s.split("-")) 
# word = 'Suyash:Chaudhary:Noida' 
# print(word.split(':')) 
# t = "23456" 
# print(t.split()) 
# t = "2 3 4 5" 
# print(t.split()) 
# -------------------------------------------------------------------


# 15. Find the output : 

# l1 = list(map(int, input().split())) 
# l2 = list(map(int, input().split())) 
# result = l1 + l2 
# print(result) 
# result1 = l1 * 3 
# print(result1) 