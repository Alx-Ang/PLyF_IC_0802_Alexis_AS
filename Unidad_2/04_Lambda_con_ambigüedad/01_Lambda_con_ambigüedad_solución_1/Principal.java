public class Principal{
    public static void main(String[] args) {
        Principal.engine((int x, int y) -> x + y);
        Principal.engine((int x, int y) -> x * y);
        Principal.engine((int x, int y) -> x / y);
        Principal.engine((int x, int y) -> x - y);
        Principal.engine((int x, int y) -> x % y);

    }

    // Sobrecarga de métodos
    private static void engine(CalculadoraInt cal){
        int x = 2, y = 4;
        int resultado = cal.calcular(x, y);
        System.out.println("Resultado = " + resultado);
    }
    
    private static void engine(CalculadoraLong cal){
        long x = 2, y = 4;
        long resultado = cal.calcular(x, y);
        System.out.println("Resultado = " + resultado);
    }
    
}
