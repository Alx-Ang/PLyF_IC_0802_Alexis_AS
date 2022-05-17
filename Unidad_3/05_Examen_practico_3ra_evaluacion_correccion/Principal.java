public class Principal{ /*Paso 1 */
    public static void main(String[] args) {  /*Paso 2 */
    PruebaExamen pe; /*Paso 3*/
    pe = (a,b,c) -> System.out.println((a+b+c)); /*Paso 4 */
    System.out.println(PruebaExamen.OperacionPrueba(2,4)); /*Paso 5*/

    pe.MensajeHola(); /*Paso 6*/
    pe.MensajeHola("Hola Mundo"); /*Paso 7*/

    pe = (a,b,c) -> System.out.println((a+(b*c))); /*Paso 8*/
    pe.OperacionPrueba(5,PruebaExamen.OperacionPrueba(6,8), PruebaExamen.OperacionPrueba(10,12)); /*Paso 9*/

    miMetodo(pe); /*Paso 12*/
    miMetodo((a,b,c) -> System.out.println((a+(b/c)))); /*Paso 13*/

    pe = (a,b,c)->System.out.println(((float)a+((float)b/(float)c))); /*Paso 16*/
    miMetodo(pe,3,6,9); /*Paso 17*/
    }

    private static void miMetodo(PruebaExamen pe) { /*Paso 10*/
        pe.OperacionPrueba(6,PruebaExamen.OperacionPrueba(4,4),PruebaExamen.OperacionPrueba(2,2)); /*Paso 11*/
    }
    private static void miMetodo(PruebaExamen pe, int a,int b,int c) { /*Paso 14*/
        pe.OperacionPrueba(a,PruebaExamen.OperacionPrueba(b,b),PruebaExamen.OperacionPrueba(c,c)); /*Paso 15*/
    }
}