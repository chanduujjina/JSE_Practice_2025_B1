```mermaid
flowchart TD
    Start([Start])
    
    Start --> CheckEmpty{Are all fields non-empty?}
    
    CheckEmpty -- No --> ErrorEmpty[Error: All fields are required]
    CheckEmpty -- Yes --> ValidateID{ID matches \d+}
    
    ValidateID -- No --> ErrorID[Error: Invalid ID]
    ValidateID -- Yes --> ValidateName{Name matches ^[a-zA-Z]+$}
    
    ValidateName -- No --> ErrorName[Error: Invalid Name]
    ValidateName -- Yes --> ValidateGender{Gender selected}
    
    ValidateGender -- No --> ErrorGender[Error: Gender is required]
    ValidateGender -- Yes --> ValidatePAN{PAN matches A-Z{5}0-9{4}A-Z}
    
    ValidatePAN -- No --> ErrorPAN[Error: Invalid PAN]
    ValidatePAN -- Yes --> ValidateAadhar{Aadhar matches 2-9 followed by 11 digits}
    
    ValidateAadhar -- No --> ErrorAadhar[Error: Invalid Aadhar]
    ValidateAadhar -- Yes --> ValidatePhone{Phone matches 10 digits}
    
    ValidatePhone -- No --> ErrorPhone[Error: Invalid Phone]
    ValidatePhone -- Yes --> Success([Validation Successful])
```
