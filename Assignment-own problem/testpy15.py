# # Online Python compiler (interpreter) to run Python online.
# # Write Python 3 code in this online editor and run it.
# Question: Bubble Sort

# Given:

# arr = [5, 3, 8, 4, 2]


def bubble_Sort(arr):
    n=len(arr)
    
    for i in range(n):
        for j in range(0,n-i-1):
            
            if arr[j]>arr[j+1]:
                arr[j], arr[j+1] = arr[j+1], arr[j]
                
    return arr
    
print(bubble_Sort([5, 3, 8, 4, 2]))