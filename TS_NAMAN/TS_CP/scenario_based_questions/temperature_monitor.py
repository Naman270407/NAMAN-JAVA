# 9. The Temperature Monitor 
# A weather station records the temperature of n days. The station wants to count how 
# many days 
# the temperature was above the average temperature. 
# Input Format 
# ● 
# First line: integer n (1 ≤ n ≤ 1000). 
# ● 
# Second line: n integers (temperature of each day). 
# Output Format 
# Print the count of days with temperature above average. 
# Sample Input 
# 5 
# 30 40 35 50 45 
# Sample Output 
# 2 
# (Avg = 40, above average = 50, 45 → 2 days)

n = int(input())
l = list(map(int, input().split()))
avg = sum(l)/len(l)
count = 0
for i in l:
    if (i > avg):
        count += 1
print(count)
