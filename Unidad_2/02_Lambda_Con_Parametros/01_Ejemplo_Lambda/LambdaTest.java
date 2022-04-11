public class LambdaTest{
    public static void main(String[] args) {
        //Expreción lambda => representa un objeto de una interfaz funcional
        Operaciones op = (num1, num2) -> System.out.println(num1 + num2); //implementacion del metodo "saludar()"
                                                                // de la Interfaz Funcional<
        op.imprimeSuma(5, 10);
    }
}