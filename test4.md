```mermaid
graph TD
    Start --> CheckWeather
    CheckWeather{Is it sunny?}
    CheckWeather -- Yes --> GoOutside
    CheckWeather -- No --> StayInside
    GoOutside --> End
    StayInside --> End

