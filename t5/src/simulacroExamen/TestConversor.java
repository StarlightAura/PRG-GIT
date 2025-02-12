package simulacroExamen;

public class TestConversor {
    public static void main(String[] args) {
        System.out.println(Conversor.celsiusAFahrenheit(20) + "ºF");
        System.out.println(Conversor.fahrenheitACelsius(68) + "ºC");

        Conversor cv = new Conversor();

        System.out.println(cv.kilometrosAMillas(10) + " millas");
        System.out.println(cv.millasAKilometros(6.2) + " kilometros");
    }
}
