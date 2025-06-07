```mermaid
graph TD
    Start --> CheckWeather
    CheckWeather{Saecrh for the Method Inside the Child?}
    CheckWeather -- Yes --> InvokeMethodInChild
    CheckWeather -- No --> InvokeMethodInParent
    InvokeMethodInChild --> End
    InvokeMethodInParent --> End

