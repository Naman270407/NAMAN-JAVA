# 7.Separate Odd Even 
# You are given an integer array A. 
# You have to print the odd and even elements of array A in 2 separate lines. 
# Input: A = [1 2 3 4 5]       Output: 1 3 5      2 4 

l = list(map(int, input().split())) 
even = [] 
odd = [] 
for i in l: 
   if (i%2==0): 
      even.append(i) 
   else: 
      odd.append(i) 
print("Even numbers:", even) 
print("Odd numbers:", odd) 
