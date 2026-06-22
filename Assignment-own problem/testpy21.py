# Online Python compiler (interpreter) to run Python online.
# Write Python 3 code in this online editor and run it.
# Given:

# nums = [1, 3, 5, 7, 9, 11, 13]
# target = 9

# Return the index of the target.


def binary_search(nums,target):
    
    left = 0
    right = len(nums) -1
    
    while left <= right:
        
        mid = (left + right) // 2
        
        if nums[mid] == target :
            return mid
            
        elif nums[mid] < target :
            left = mid + 1
            
        else :
            right = mid - 1
            
    return -1
    
print(binary_search([1, 3, 5, 7, 9, 11, 13],9))