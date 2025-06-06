```mermaid
graph TD
    Start --> CheckWeather
    CheckWeather{a > b}
    CheckWeather -- Yes --> Print A
    CheckWeather -- No --> Print B
    Print A --> End
    Print B --> End

