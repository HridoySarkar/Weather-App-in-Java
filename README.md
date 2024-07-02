# WeatherApp V1.0.0

## Overview
WeatherApp V1.0.0 is a simple yet elegant desktop application that provides real-time weather information for any location entered by the user. Built using Java Swing for the GUI and leveraging the Open-Meteo API for weather data, this application offers an intuitive interface and essential weather details such as temperature, weather condition, humidity, and wind speed.

## Features
- **Search Functionality**: Enter the name of any city or location to get the current weather information.
- **Weather Icons**: Visually represent the weather condition (e.g., clear, cloudy, rainy, snowy) with icons.
- **Temperature Display**: Shows the current temperature in Celsius.
- **Weather Condition Description**: Provides a textual description of the current weather condition.
- **Humidity Level**: Displays the current humidity percentage.
- **Wind Speed**: Shows the current wind speed in km/h.

## API Integration
The application uses the following APIs:

### Open-Meteo Weather API
For fetching weather data.
- **Example URL**: 
https://api.open-meteo.com/v1/forecast?latitude=52.52&longitude=13.41&hourly=temperature_2m,relative_humidity_2m,weather_code,wind_speed_10m&timezone=Asia%2FSingapore


### Open-Meteo Geocoding API
For fetching location coordinates based on the city name.
- **Example URL**: 
Sure, here's the API Integration section formatted in Markdown:

markdown

## API Integration
The application uses the following APIs:

### Open-Meteo Weather API
For fetching weather data.
- **Example URL**: https://api.open-meteo.com/v1/forecast?latitude=52.52&longitude=13.41&hourly=temperature_2m,relative_humidity_2m,weather_code,wind_speed_10m&timezone=Asia%2FSingapore


### Open-Meteo Geocoding API
For fetching location coordinates based on the city name.
- **Example URL**: https://geocoding-api.open-meteo.com/v1/search?name=Berlin&count=10&language=en&format=json
