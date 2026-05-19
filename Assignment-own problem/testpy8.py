# Online Python compiler (interpreter) to run Python online.
# Write Python 3 code in this online editor and run it.
# Write a function to compress a string."aabbcc"--->"a2b2c2"

def comp_string(word):
    count={}
    for ch in word:
        if ch in count:
            count[ch]+=1
        else:
            count[ch]=1
            
    result =""
            
    for ch in count:
        result+=ch+str(count[ch])
     
    return result

print(comp_string("aabbcc"))
