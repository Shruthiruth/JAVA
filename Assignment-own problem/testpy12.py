# # Online Python compiler (interpreter) to run Python online.
# # Write Python 3 code in this online editor and run it.
#  Find Missing Number

# Given:

# [1,2,3,5]--4


def miss_num(list):
    
    total = 0
    actualsum = 0
    maxi=max(list)
    mini=min(list)
    
    for i in range(mini,maxi+1):
        total+=i;
     
    for i in list:
        actualsum+=i
        
    result=total-actualsum
    return result
    
print(miss_num([1,2,3,5]))

        