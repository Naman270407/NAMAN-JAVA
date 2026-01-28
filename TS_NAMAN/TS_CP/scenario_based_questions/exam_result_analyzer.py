# 1. The Exam Result Analyzer 
# In a class of n students, each student’s marks are given in a list. A student 
# passes if their marks 
# are greater than or equal to 35. 
# Write a program to count the number of students who passed and failed. 
# Input Format 
# ● 
# First line: integer n (1 ≤ n ≤ 1000). 
# ● 
# Second line: n integers (marks of students). 
# Output Format 
# Print two integers: the count of passed students and the count of failed students. 
# Sample Input 
# 6 
# 12 67 45 22 90 33 
# Sample Output 
# 3 3 
# Explanation 
# Passed = 67, 45, 90 → 3 students. 
# Failed = 12, 22, 33 → 3 students.

n = int(input())
l = list(map(int, input().split()))
p = 0
f = 0
for i in l:
    if (i >= 35):
        p = p +1
    else:
        f = f + 1
print(p,f)
