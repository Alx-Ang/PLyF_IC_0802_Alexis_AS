#include "persona.h"
int main(int argc, char const *argv[]){
    
    persona *personas;
    personas=(persona*)malloc(sizeof(struct persona));
    personas->nombre=(char*)malloc(sizeof(char)*20);
    personas->apellido=(char*)malloc(sizeof(char)*30);
    personas->nombre="Alexis";
    personas->apellido="Angeles Segundo";
    personas->edad=21;
    personas->genero='M';

    mostrarPersona(personas);
    comer(personas);
    caminar(personas);
    hablar(personas);
    dormir(personas);
    return 0;
}