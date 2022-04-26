public class Principal{
    public static void main(String[] args) {
        CalculadoraInt objInt = (x, y) -> x + y;
        Principal.engine(objInt);
        objInt = (x, y) -> x * y;
        Principal.engine(objInt);
        objInt = (x, y) -> x / y;
        Principal.engine(objInt);

        CalculadoraInt objLong=(x, y) -> x -y;
        Principal.engine(objLong);
        objLong = (x, y) -> x % y;
        Principal.engine(objLong);
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
