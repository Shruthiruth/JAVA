# Given:

# nums = [2, 7, 11, 15, 3, 6]
# target = 9

# Expected Output:

# [(2, 7), (3, 6)]



def two_pair(nums,target):
    
    seen=set()
    pairs=[]
    
    for num in nums:
        compliment = target-num
        
        if compliment in seen:
            pairs.append((compliment,num))
            
        seen.add(num)
        
    return pairs
        
print(two_pair([2,7,11,15,3,6], 9))
            