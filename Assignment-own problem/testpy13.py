# Online Python compiler (interpreter) to run Python online.
# Write Python 3 code in this online editor and run it.
# print("Start small. Ship something.")
# decorator



def decorator(func):
    
    def wrapper():
        print("before")
        func()
        print("after")
        
    return wrapper
        

@decorator
def welcome():
    print("welcome")
    
welcome()
    
# result=decorator(welcome)
# print(result)

