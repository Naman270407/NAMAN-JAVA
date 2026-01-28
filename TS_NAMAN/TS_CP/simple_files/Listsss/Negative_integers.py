# 5.Negative Integers 
# Write a program to print all negative numbers from input array A of size N. 
# Input:-  A = [1 -5 2 -8 -4]       Output: -5 -8 -4 

l = list(map(int, input().split()))
for i in l:
    if (i < 0):
        print(i, end=" ")
