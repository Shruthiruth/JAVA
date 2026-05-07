# Online Python compiler (interpreter) to run Python online.
# Write Python 3 code in this online editor and run it.
print("Start small. Ship something.")
#palindrome 

def palindrome(Word):
    rev=Word[::-1]
    print(rev)
    
    if rev == Word:
        print('Palindrome')
    else :
        print('Not Palindrome')
        

palindrome('helo')