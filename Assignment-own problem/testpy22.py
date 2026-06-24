# # Online Python compiler (interpreter) to run Python online.
# # Write Python 3 code in this online editor and run it.
# Given a string containing only A and B:

# s = "AAABBB"

# Return:

# True


def check_AB(s):
    seen_b=False
    for ch in s:
        if ch == "B":
            seen_b=True
            
        if ch == "A" and seen_b:
            return False
            
    return True
    
print(check_AB("AABBB"))
            