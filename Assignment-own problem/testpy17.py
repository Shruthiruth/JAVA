# # Online Python compiler (interpreter) to run Python online.
# # Write Python 3 code in this online editor and run it.
# Count Character Frequency in a String

# Given:

# s = "programming"

# Expected output:

# {
#  'p': 1,
#  'r': 2,
#  'o': 1,
#  'g': 2,
#  'a': 1,
#  'm': 2,
#  'i': 1,
#  'n': 1
# }
# Rules


def count_char(s):
    
    count={}
    
    for ch in s:
        if ch in count:
            count[ch] += 1
        else :
            count[ch] = 1
            
    return count
    
print(count_char("programming"))