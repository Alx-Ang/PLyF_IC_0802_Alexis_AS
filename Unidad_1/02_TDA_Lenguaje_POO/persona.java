public class persona{
    //atributos
    private String nombre;
    private String apellido;
    private int edad;
    private char genero;

    //metodo_constructor
    public persona(String parametro_nombre, String parametro_apellido, int parametro_edad, char parametro_genero){
        this.nombre = parametro_nombre;
        this.apellido = parametro_apellido;
        this.edad = parametro_edad;
        this.genero = parametro_genero;
    }
    public void comer(){
        System.out.println("Mis acciones son: \ncomer");
    }
    public void caminar(){
        System.out.println("caminar");
    }
    public void hablar(){
        System.out.println("hablar");
    }
    public void dormir(){
        System.out.println("dormir");
    }
    
    public void mostrarPersona(){
        System.out.println("Mi nombre es: "+this.nombre+" "+this.apellido+"\nEdad: "+this.edad+" años\nGenero M/F: "+this.genero);
    }
}