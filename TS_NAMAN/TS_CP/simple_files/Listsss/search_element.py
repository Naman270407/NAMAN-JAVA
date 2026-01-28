#  4.Search Element
#  You are given array A and an integer B. You have to tell whether B is present in array A
#  or not.   Input: A=[1 5 9 1]       B=5          Output:1

l = list(map(int, input().split()))
n = int(input("Enter search element : "))
count = 0
for i in l:
    if i == n:
        count = count + 1
print("only present times = ", count)
