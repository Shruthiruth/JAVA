# find duplicates in a list

# //[1,2,3,2,4,5,1,6]



def find_dup(list):
    count={}
    duplicates=[]
    
    for ls in list:
        if ls in count:
            count[ls]+=1
        else:
            count[ls]=1
            
    for ls in list:
        if count[ls]>1 and ls not in duplicates:
            duplicates.append(ls)
           
           
            
    return duplicates
    
    
result=find_dup([1,2,3,2,4,5,1,6])
print(result)