# Non-repeating character in a string
def non_char(s):
    count = {}

    # Step 1: count frequency
    for ch in s:
        if ch in count:
            count[ch] += 1
        else:
            count[ch] = 1

    # Step 2: find first non-repeating
    for ch in s:
        if count[ch] == 1:
            return ch


result = non_char("aabbcdeff")
print(result)