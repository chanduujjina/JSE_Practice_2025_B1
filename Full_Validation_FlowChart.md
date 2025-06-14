```mermaid
flowchart TD
    Start([Start])
    
    Start --> CheckEmpty{Are all fields non-empty?}
    
    CheckEmpty -- No --> ErrorEmpty[Display Error: "All fields are required"]
    CheckEmpty -- Yes --> ValidateID{ID matches \d+?}
    
    ValidateID -- No --> ErrorID[Display Error: "Invalid ID"]
    ValidateID -- Yes --> ValidateName{Name matches ^[a-zA-Z]+$?}
    
    ValidateName -- No --> ErrorName[Display Error: "Invalid Name"]
    ValidateName -- Yes --> ValidateGender{Gender selected?}
    
    ValidateGender -- No --> ErrorGender[Display Error: "Gender is required"]
    ValidateGender -- Yes --> ValidatePAN{PAN matches ^[A-Z]{5}[0-9]{4}[A-Z]$?}
    
    ValidatePAN -- No --> ErrorPAN[Display Error: "Invalid PAN"]
    ValidatePAN -- Yes --> ValidateAadhar{Aadhar matches ^[2-9][0-9]{11}$?}
    
    ValidateAadhar -- No --> ErrorAadhar[Display Error: "Invalid Aadhar"]
    ValidateAadhar -- Yes --> ValidatePhone{Phone matches \d{10}?}
    
    ValidatePhone -- No --> ErrorPhone[Display Error: "Invalid Phone"]
    ValidatePhone -- Yes --> Success([Validation Successful])

```
