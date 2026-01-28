# 4. The Scholarship Eligibility 
# In a university, n students applied for scholarships. The eligibility criteria are: 
# ● 
# The student’s marks must be greater than or equal to 75. 
# ● 
# The student’s attendance percentage must be greater than or equal to 80. 
# Write a program to count how many students are eligible for scholarships. 
# Input Format 
# ● 
# First line: integer n (1 ≤ n ≤ 500). 
# ● 
# Next n lines: each contains two integers → marks and attendance percentage. 
# Output Format 
# Print the number of eligible students. 
# Sample Input 
# 4 
# 85 90 
# 70 85 
# 75 80 
# 90 70 
# Sample Output 
# 2 
# Explanation 
# (85,90) eligible 
# (70,85) (marks < 75) 
# (75,80) eligible 
# (90,70) (attendance < 80)

n = int(input())
count = 0
for i in range (n):
    marks , percentage = map(int, input().split())
    if (marks >= 75 and percentage >= 80):
        count = count + 1
print(count)
