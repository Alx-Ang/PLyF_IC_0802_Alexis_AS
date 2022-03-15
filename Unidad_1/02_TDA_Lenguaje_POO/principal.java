public class principal{
    public static void main(String[] args) {
        persona personas = new persona("Alexis", "Angeles Segundo", 21,'M');
        personas.mostrarPersona();
        personas.comer();
        personas.caminar();
        personas.hablar();
        personas.dormir();
    }
}