# Given:

# matrix = [
#     [1,2,3],
#     [4,5,6],
#     [9,8,9]
# ]

# Find

# Primary Diagonal Sum
# -
# Secondary Diagonal Sum

# Return the absolute difference.

def diagonal_matrix(matrix):
    
    prim_diag=0
    second_diag=0
    
    for i in range(len(matrix)):
        
        prim_diag += matrix[i][i]
        second_diag += matrix[i][len(matrix)-1-i]
        
    return abs(prim_diag-second_diag)
    
print( diagonal_matrix( [
    [1,2,3],
    [4,5,6],
    [9,8,9]
]))