# Online Python compiler (interpreter) to run Python online.
# Write Python 3 code in this online editor and run it.
def prime_num(n):
    

        
        if n <= 1:
            return "not prime"
       
        for i in range(2,n):
            if n % i ==0:
                return "not prime"
                
        return "prime"
           
             
print(prime_num(1))
            