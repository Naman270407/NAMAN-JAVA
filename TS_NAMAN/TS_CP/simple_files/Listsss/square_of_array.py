# 8.Square of Array 
# You are provided with an integer array A. Return another array B of size same as that of 
# A such that B[i] = A[i]^2 
# Input: A=[2, 6, 8, 1]         Output: [4, 36, 64, 1] 

l = list(map(int, input().split()))
b = []
for i in l:
    b.append(i*i)
print(b)
