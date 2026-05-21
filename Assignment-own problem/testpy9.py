# Online Python compiler (interpreter) to run Python online.
# Write Python 3 code in this online editor and run it.
# Find the First Duplicate Element [1,2,5,1,2,3,5,1]--2

def dup_first(list):
    count={}
    dup=[]
    
    for ls in list:
        if ls in count:
            count[ls]+=1
        else:
            count[ls]=1
            
    for ls in count:
        if count[ls]>1 and ls not in dup:
            dup.append(ls)
    
    return dup[0]
    
print(dup_first([1,2,5,1,2,3,5,1]))
    
