# 11. Add two list element: 
# Given two lists A1 and A2, each containing integers, write a Python program to compute 
# the element-wise sum of the corresponding elements in the two lists and store the result 
# in a new list. 
# Input: 
# A1=[1, 2, 3,4] 
# A2=[4, 5, 6,7] 
# Output: 
# [5, 7, 9, 11] 

a = list(map(int, input().split()))
b = list(map(int, input().split()))
c = []
for i in range (0,len(a)):
    c.append(a[i]+b[i])
print(c)
