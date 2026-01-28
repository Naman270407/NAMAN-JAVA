# 7. The Stock Price Fluctuation 
# A company records daily stock prices of n days. The manager wants to know how many 
# days 
# the stock price was strictly higher than the previous day. 
# Input Format 
# ● 
# First line: integer n (1 ≤ n ≤ 1000). 
# ● 
# Second line: n integers (stock prices). 
# Output Format 
# Print the number of days where price increased compared to the previous day. 
# Sample Input 
# 7 
# 100 102 101 105 107 106 110 
# Sample Output 
# 4


n = int(input())
l = list(map(int, input().split()))
count = 0
for i in range(1,n):
    if (l[i] > l[i-1]):
        count += 1
print(count)
