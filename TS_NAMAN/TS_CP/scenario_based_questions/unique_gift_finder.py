# 10. The Unique Gift Finder 
# A shop maintains a list of customer gift codes (n codes). The manager wants to find and 
# print 
# the codes that appear exactly once in the list. Print them in the same order as they 
# appeared. 
# If none, print -1. 
# Input Format 
# ● 
# First line: integer n (1 ≤ n ≤ 1000). 
# ● 
# Second line: n integers (gift codes). 
# Output Format 
# Print unique gift codes separated by space. 
# Sample Input 
# 8 
# 10 20 30 10 40 20 50 60 
# Sample Output 
# 30 40 50 60


n = int(input())
l = list(map(int, input().split()))
count = 0
u = []
for i in l:
    if (l.count(i)==1):
        print(i,end=" ")
        u.append(i)
if(len(u)==0):
    print(-1)
