public class Principal{
    public static void main(String[] args) {
        System.out.println("CalculadoraInt -> Resultado = " + Principal.engine((int)5,(int)5).calculate(4,4));
        System.out.println("CalculadoraLong -> Resultado = " + Principal.engine((long)5,(long)5).calculate(4,4));
    }
    //Retorna un objeto de tipo "calculardoraInt"
    private static CalculadoraInt engine(int a, int b){
        return (x, y) -> a * b;
    }
    //Retorna un objeto de tipo "calculardoraLong"
    private static CalculadoraLong engine(long a, long b){
        return (x, y) -> a - b;
    }
}