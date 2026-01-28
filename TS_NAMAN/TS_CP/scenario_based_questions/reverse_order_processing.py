# 8. The Reverse Order Processing 
# A factory records n product IDs. The supervisor wants to print them in reverse order, but 
# only 
# those IDs that are divisible by 5. If none, print -1. 
# Input Format 
# ● 
# First line: integer n (1 ≤ n ≤ 1000). 
# ● 
# Second line: n integers (product IDs). 
# Output Format 
# Print the IDs divisible by 5 in reverse order. 
# Sample Input 
# 6 
# 12 25 40 33 50 27 
# Sample Output 
# 50 40 25


n = int(input())
l = list(map(int, input().split()))
u = []
for i in l:
    if (i % 5 == 0):
        u.append(i)
if (len(u)==0):
    print(-1)
u.reverse()
print(*u)
