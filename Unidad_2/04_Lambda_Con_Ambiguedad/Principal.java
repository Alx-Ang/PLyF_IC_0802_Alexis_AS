public class Principal{
    public static void main(String[] args) {
        Principal.engine((x, y) -> x + y);
        Principal.engine((x, y) -> x * y);
        Principal.engine((x, y) -> x / y);
        Principal.engine((x, y) -> x - y);
        Principal.engine((x, y) -> x % y);

        Principal.engine1((x, y) -> x + y);
        Principal.engine1((x, y) -> x * y);
        Principal.engine1((x, y) -> x / y);
        Principal.engine1((x, y) -> x - y);
        Principal.engine1((x, y) -> x % y);
    }

    // Sobrecarga de métodos
    private static void engine(CalculadoraInt cal){
        int x = 2, y = 4;
        int resultado = cal.calcular(x, y);
        System.out.println("Resultado Int = " + resultado);
    }
    
    private static void engine1(CalculadoraLong cal){
        int x = 2, y = 4;
        int resultado = (int) cal.calcular(x, y);
        System.out.println("Resultado Long = " + resultado);
    }
    
}