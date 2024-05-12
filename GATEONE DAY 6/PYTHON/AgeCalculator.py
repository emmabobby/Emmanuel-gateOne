from datetime import datetime

def calculate_age(date_of_birth):
 
    dob = datetime.strptime(date_of_birth, '%d-%m-%Y')

    current_date = datetime.now()
    
    age = current_date.year - dob.year - ((current_date.month, current_date.day) < (dob.month, dob.day))
    
    return age

def main()
    dob_input = input("Enter your date of birth (DD-MM-YYYY): ")
    
    age = calculate_age(dob_input)
    
    print("Age:", age, "years")

if _name_ == "_main":
    main()