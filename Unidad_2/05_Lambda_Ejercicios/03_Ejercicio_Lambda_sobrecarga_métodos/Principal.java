public class Principal{
    public static void main(String[] args) {
        System.out.println("==> CalculadoraInt --> Resultado = " + Principal.engine().calculate(5,5));
        System.out.println("==> CalculadoraLong --> Resultado = " + Principal.engine( 3).calculate(6,2));
    }
    //Retorna un objeto de tipo "calculardoraInt"
    private static CalculadoraInt engine(){
        return (x, y) -> x * y;
    }
    //Retorna un objeto de tipo "calculardoraLong"
    private static CalculadoraLong engine(int x1){
        return (x, y) -> x - y;
    }
}