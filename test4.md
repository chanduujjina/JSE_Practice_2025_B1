```mermaid
graph TD
    Start --> CheckWeather
    CheckWeather{a > b}
    CheckWeather -- Yes --> A
    CheckWeather -- No --> B
    A --> End
    B --> End

