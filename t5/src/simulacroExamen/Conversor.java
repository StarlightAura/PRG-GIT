package simulacroExamen;

public class Conversor {
    private static int contadorConversiones;

    public static double celsiusAFahrenheit(double celsius){
        contadorConversiones++;
        return ((celsius * 9/5)+ 32);
    }

    public static double fahrenheitACelsius(double fahrenheit){
        contadorConversiones++;
        return ((fahrenheit - 32) * 5/9);
    }

    public double kilometrosAMillas(double kilometros){
        contadorConversiones++;
        return (kilometros * 0.621371);
    }

    public double millasAKilometros(double millas){
        contadorConversiones++;
        return (millas / 0.621371);
    }
}