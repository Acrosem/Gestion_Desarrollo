#include <iostream>

/*
Dar un nuevo identificador APODO a un tipo de dato existente.
Agregar al final del typedef un guion bajo y una "t" 
para indicar que es de tipo (_t) 

Sintaxis:
typedef + (tipo de dato) + (nuevo nombre del dato)
*/

//typedef std::string text_t;
//typedef int numero_t;

//Se recomienda mejor usar USING porque funciona mejor con plantillas

using text_t = std::string;
using numero_t = int;

int main(){

    text_t nombre= "Filo";
    numero_t edad= 22;
    std::cout<<nombre<<" "<<edad<<std::endl;

    return 0;
}