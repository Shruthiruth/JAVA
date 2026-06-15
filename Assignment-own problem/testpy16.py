# Online Python compiler (interpreter) to run Python online.
# Write Python 3 code in this online editor and run it.
# Find the Largest Element in a List

# Given:

# nums = [10, 45, 3, 78, 25]


def lar_num(nums):
    
    lar = nums[0]
 
    
    for num in nums:
        if num > lar:
            lar = num
            
            
    return lar
    
print(lar_num([10,45,3,78,25]))