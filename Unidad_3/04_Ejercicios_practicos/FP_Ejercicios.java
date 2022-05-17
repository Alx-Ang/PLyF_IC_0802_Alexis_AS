import java.util.List;

public class FP_Ejercicios{
    public static void main(String[] args) {

        List<Integer> numbers = List.of(12,9,13,4,6,2,4,12,15);
        List<String> courses = List.of("Spring","Spring Boot","API","Microservices","AWS","Azure","Docker","Kubernetes");
        
        System.out.println("\n\tImprime numeros impares: ");
        Numeros_Impares(numbers);
        System.out.println("\n\n\tImprime una lista de todos los cursos:");
        Lista_Cursos(courses);
        System.out.println("\n\tImprime los cursos con la plabra 'Spring':");
        Lista_Cursos_String(courses);
        System.out.println("\n\n\tImprime los curso con mas de 4 letras:");
        Imprimir_word_mayor_4(courses);
        System.out.println("\n\n\tImprime el valor cubico de los numeros impares: ");
        Cubo_de_numeros(numbers);
        System.out.println("\n\n\tImprime los numero de caracteres por palabra: ");
        Num_Caracteres(courses);
    }
    
    private static void Numeros_Impares(List<Integer> numbers){
        numbers.stream()
                .filter(number -> number % 2 != 0)
                .forEach(number -> System.out.print(number+", "));
    }

    private static void Lista_Cursos(List<String> courses){
        courses.stream().forEach(curso -> System.out.println(" "+curso));
    }
    
    private static void Lista_Cursos_String(List<String> courses){
        courses.stream()
                .filter(curso -> curso.contains("Spring"))
                .forEach(curso -> System.out.print("\n"+curso));
    }

    private static void Imprimir_word_mayor_4(List<String> courses){
        courses.stream()
                .filter(curso -> curso.length() >= 4)
                .forEach(curso -> System.out.print(curso+"\n"));
    }

    private static void Cubo_de_numeros(List<Integer> numbers){
        numbers.stream()
                .filter(number -> number % 2 != 0)
                .map(number -> number *number * number)
                .forEach(number -> System.out.print(number+", "));
    }

    private static void Num_Caracteres(List<String> courses){
        courses.stream().forEach(curso -> System.out.print(curso.length()+", "));
    }
}
