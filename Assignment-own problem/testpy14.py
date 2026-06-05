# # Online Python compiler (interpreter) to run Python online.
# # Write Python 3 code in this online editor and run it.
# Find elements present in first list but NOT present in second list.


def find_ele(list1,list2):
    # list1=[10,20,30]
    # list2=[20]
    
    res=[]
    
    for l1 in list1:
       
            if l1 not in list2:
                res.append(l1)
                
    
    return res
    
print(find_ele([10,20,30],[10]))