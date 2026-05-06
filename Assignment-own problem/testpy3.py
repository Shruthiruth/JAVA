# Function to find the second largest number in a list
def second_lar(nums):
    lar = float('-inf')
    sec = float('-inf')

    for num in nums:
        if num > lar:
            sec = lar
            lar = num
        elif num > sec and num != lar:
            sec = num

    return sec


result = second_lar([10, 20, 4, 45, 99])
print(result)