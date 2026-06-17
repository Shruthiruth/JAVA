# # Online Python compiler (interpreter) to run Python online.
# # Write Python 3 code in this online editor and run it.
# Problem: Two Sum

# Given:

# nums = [2, 7, 11, 15]
# target = 9

# Return the indices of the two numbers that add up to the target.

# Expected:

# [0, 1]

def index_pair(nums,target):
    
    seen={}
  
    
    
    for i,num in enumerate(nums):
        compliment = target - num
        
        if compliment in seen:
            return [seen[compliment],i]
            
        seen[num]=i
 
    
print(index_pair([2, 7, 11, 15],9))