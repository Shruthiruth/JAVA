# Expand Encoded Letters

def endoded_letters(list):
   result=[]
   
   for items in list:
       
       ch=items[0]
       num=int(items[1])
       
       result.append(ch*num)
       
   return result
    
print(endoded_letters(['C2','D4']))