# 2. The Employee ID Filter 
# A company stores n employee IDs in a list. The HR wants to print only those IDs 
# that are even 
# numbers (since odd IDs are temporary employees). 
# Input Format 
# ● 
# First line: integer n (1 ≤ n ≤ 500). 
# ● 
# Second line: n integers (employee IDs). 
# Output Format 
# Print all even employee IDs separated by a space. If none, print -1. 
# Sample Input 
# 7 
# 101 202 303 404 111 222 333 
# Sample Output 
# 202 404 222 
# Explanation 
# Only even IDs are selected. 

n = int(input())
l = list(map(int, input().split()))
count = 0
for i in l:
    if (i%2==0):
        print(i,end=" ")
        count = count +1
if (count == 0):
    print(-1)
