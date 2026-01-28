 
# 10.Reverse 
# Given an array A, Find the reverse of it. (Solve this question with for loop) 
# Input:  A = [3, 5, 1, 2, 1, 2] 
# Output:  [2, 1, 2, 1, 5, 3] 

# l = list(map(int, input().split()))
# l.reverse()
# print(l)

#     or or or

l = list(map(int, input().split()))
b =[]
for i in range (len(l)-1,-1,-1):
    b.append(l[i])
print(b)
