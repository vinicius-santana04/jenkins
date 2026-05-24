import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ConversorTemperaturaTest {

    @Test
    public void testFahrenheitParaCelsius() {
        ConversorTemperatura conversor = new ConversorTemperatura();
        assertEquals(0.0, conversor.fahrenheitParaCelsius(32.0), 0.01);
    }

    @Test
    public void testCelsiusParaFahrenheit() {
        ConversorTemperatura conversor = new ConversorTemperatura();
        assertEquals(32.0, conversor.celsiusParaFahrenheit(0.0), 0.01);
    }
}