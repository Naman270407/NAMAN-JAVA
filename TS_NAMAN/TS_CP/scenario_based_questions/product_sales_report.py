# 3. The Product Sales Report 
# A store keeps a list of sales of n products. Each product has a sales count. The 
# manager wants 
# to print the highest-selling product count and the lowest-selling product count. 
# Input Format 
# ● 
# First line: integer n (1 ≤ n ≤ 1000). 
# ● 
# Second line: n integers (sales count of each product). 
# Output Format 
# Print two integers: max sales and min sales. 
# Sample Input 
# 5 
# 12 45 23 89 34 
# Sample Output 
# 89 12 
# Explanation 
# Maximum sales = 89, Minimum sales = 12. 


n = int(input())
l = list(map(int, input().split()))
print(max(l),min(l))
