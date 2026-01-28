#  3.Max and Min of an Array
#  Take input an array A of size N and write a program to print maximum and minimum
#  elements of the input array .Here N represents the length of the array .
#  Input :  A=[1 2 3 4 5]        Output:  5 1


# l = list(map(int, input().split()))
# print(max(l))
# print(min(l))

#          or or or

a = list(map(int, input().split())) 
mn = a[0] 
mx = a[0] 
for i in a: 
   if i < mn: 
       mn = i 
   if i > mx: 
       mx = i
print("max:", mx) 
print("min:", mn)
