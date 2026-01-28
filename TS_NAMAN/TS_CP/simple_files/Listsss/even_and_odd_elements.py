#   6.Even Odd Elements 
# For array A, you have to find the value of absolute difference between the counts of 
# even and odd elements in the array. 
# Array A diya h, usme jitne even (जोड़ संख्या) elements h aur jitne odd (विषम संख्या)
#  elements h un dono ki ginti ka difference nikalna hai — 
# aur wo difference hamesha positive hona chahiye (absolute difference).
# Input: A = [1 2 3 4]       Output: 0   


l = list(map(int, input().split()))
count_even = 0
count_odd = 0
absolute_difference = 0
for i in l:
    if (i % 2==0):
        count_even += 1
    else:
        count_odd += 1
absolute_difference = count_even - count_odd
print(abs(absolute_difference))
