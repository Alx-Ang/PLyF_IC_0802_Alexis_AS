import java.util.List;

public class FP_Funcional_Ejercicios{

    public static void main(String[] args){

        List<Integer> numbers = List.of(12, 9, 13, 4, 6, 2, 4, 12, 15);
        
        System.out.println("\n\tImprime lista de numeros impares: ");
        printNumerosImpares(numbers);

        List<String> course = List.of("Spring", "Spring Boot", "API",
            "Microservices", "AWS", "PCF", "Azure", "Docker", "Kubernetes");
        
        System.out.println("\n\tImprime todos los cursos indivualmente: ");
        printListaCursos(course);
        System.out.println("\n\tImprime los cursos con la plabra 'Spring': ");
        printListaCursosString(course);
        System.out.println("\n\tImprime los curso con mas de 4 letras:");
        printListaCursoMayor4Palabras(course);
        System.out.println("\n\tImprime valor cubico de los numeros impares: ");
        printNumerosImparesValorCubico(numbers);
        System.out.println("\n\n\tImprime los numero de caracteres por palabra: ");
        printNumerosCaracteresPalabras(course);
    }

    private static void printNumerosImpares(List<Integer> numbers){
        numbers.stream()
                .filter(number -> number % 2 == 1)
                .forEach(number -> System.out.print(number + ", "));
        System.out.println("");
    }
    private static void printListaCursos(List<String> course){
        course.stream().forEach(cursos-> System.out.println(cursos + " "));
    }
    private static void printListaCursosString(List<String> course){
        course.stream()
                .filter(cursos -> cursos.contains("Spring"))
                .forEach(cursos -> System.out.print(cursos + "\n"));

    }
    private static void printListaCursoMayor4Palabras(List<String> course){
        course.stream()
                .filter(cursos -> cursos.length() >= 4)
                .forEach(cursos -> System.out.print(cursos + "\n"));
    }

    private static void printNumerosImparesValorCubico(List<Integer> numbers){
        numbers.stream()
                .filter(number -> number % 2 != 0)
                .map(number -> number *number * number)
                .forEach(number -> System.out.print(number + ", "));
    }
    private static void printNumerosCaracteresPalabras(List<String> course){
        course.stream().forEach(cursos -> System.out.print(cursos.length() + ", "));
    }
}
