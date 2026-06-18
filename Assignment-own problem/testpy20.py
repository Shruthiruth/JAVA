# # Online Python compiler (interpreter) to run Python online.
# # Write Python 3 code in this online editor and run it.
# Mini Question

# For:

# numbers = [1, 2, 4, 8]
# target = 10


# def pair_Sum(nums,target):
    
#     seen=set()
#     pairs=[]
    
#     for num in nums:
#         complement=target-num
        
#         if complement in seen:
#             pairs.append((complement,num))
            
#         seen.add(num)
        
#     return pairs
    
# print(pair_Sum([1, 2, 4, 8],10))


# def two_sum(nums,target):
    
#     seen={}
    
#     for i,num in enumerate(nums):
#         complement=target-num
        
#         if complement in seen:
#             return [seen[complement],i]
            
#         seen[num]=i
        
# print(two_sum([1, 2, 4, 8],10))


def two_sumII(nums,target):
    
    left=0
    right=len(nums)-1
    
    while left < right:
        
        current_sum=nums[left]+nums[right]
        
        if current_sum == target:
            return [left +1 , right +1]
            
        elif current_sum < target:
            left += 1
        else :
            right -= 1
            
    return []
    
print(two_sumII([1, 2, 4, 8],10))