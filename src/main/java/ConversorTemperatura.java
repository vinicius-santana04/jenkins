public class ConversorTemperatura {
    public double fahrenheitParaCelsius(double fahrenheit) { return (fahrenheit - 32) * 5 / 9;
    }

    public double celsiusParaFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }
}