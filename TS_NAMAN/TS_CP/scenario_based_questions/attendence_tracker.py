# 6. The Attendance Tracker 
# A teacher records attendance for n students, where 1 means present and 0 means absent. 
# Write a program to count the number of consecutive absences (0’s) that lasted the longest. 
# Input Format 
# ● First line: integer n (1 ≤ n ≤ 1000). 
# ● Second line: n integers (0 or 1). 
# Output Format 
# Print the length of the longest streak of absentees. 
# Sample Input 
# 10   
# 1 0 0 1 0 0 0 1 1 0 
# Sample Output 
# 3

n = int(input())
l = list(map(int, input().split()))
count = 0
d = []
e = 0
for i in l:
    if (i == 0):
        count += 1
        e = count
    else:
        count = 0
        d.append(e)
print(max(d))
