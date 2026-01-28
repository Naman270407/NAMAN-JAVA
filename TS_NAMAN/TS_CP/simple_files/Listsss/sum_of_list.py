#  1.Sum of list
#  Given an array compute the sum of all elements.
#  Input : A=[1 2 3 4 5]           Output: 15

n = int(input())
list1 = []
sum = 0
for i in range(0,n):
    list1.append(int(input()))
for j in list1:
    sum = sum + j      
print("The sum is:",sum)  

#         or or or 

# a = list(map(int, input().split())) 
# b = sum(a) 
# print(b) 

#          or or or 

# a = list(map(int, input().split())) 
# b = 0 
# for i in a: 
#     b = b + i
# print(b) 

