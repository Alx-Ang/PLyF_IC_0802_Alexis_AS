public class Principal{
    public static void main(String[] args) {
        System.out.println("==> CalculadoraInt --> Resultado = " + Principal.engine_1().calculate(5,5));
        System.out.println("==> CalculadoraLong --> Resultado = " + Principal.engine_2().calculate(6,2));
    }
    //Retorna un objeto de tipo "calculardoraInt"
    private static CalculadoraInt engine_1(){
        return (x, y) -> x * y;
    }

    //Retorna un objeto de tipo "calculardoraLong"
    private static CalculadoraLong engine_2(){
        return (x, y) -> x - y;
    }
}
