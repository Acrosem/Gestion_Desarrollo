/*
La sentecnia "while":

    while(expresion logica){
        conjunto de instrucciones
    }

*/

#include <iostream>
#include <conio.h> 
/*
    Es una biblioteca de C (no estándar) que proporciona funciones
    para manejar la consola, especialmente en entornos DOS/Windows.
*/

using namespace std;

int main(){

    int i;
    i = 10;

    while (i >= 1){

        cout<<i<<endl;
        i--;//decrementa en iterador de 1 en 1
    }

    getch();

    /*
    En este código, se usa para pausar la ejecución del programa antes de que finalice. 
    Esto evita que la consola se cierre inmediatamente después de que el programa termine 
    su ejecución (especialmente útil en entornos como Dev-C++ o algunos IDEs donde la consola
    se cierra automáticamente al terminar el programa).
    */
   
    return 0;
}