#ifndef __PERSONA_H
#define __PERSONA_H

    #include <stdlib.h>
    #include <stdio.h>
typedef struct persona{
    char *nombre;
    char *apellido;
    int edad;
    char genero;
}persona;

void mostrarPersona(persona *personas);
void comer(persona *personas);
void caminar(persona *personas);
void hablar(persona *personas);
void dormir(persona *personas);
#endif