#include "persona.h"
void mostrarPersona(persona *personas){
    printf("Mi nombre es: %s %s \nEdad: %i años\n",personas->nombre,personas->apellido,personas->edad);
}
void comer(persona *personas){
    printf("Mis acciones son: \ncomer");
}
void caminar(persona *personas){
    printf("\ncaminar");
}
void hablar(persona *personas){
    printf("\nhablar");
}
void dormir(persona *personas){
    printf("\ndormir\n");
}