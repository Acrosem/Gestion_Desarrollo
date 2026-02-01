/*La sentencia switch

    switch(expresion){
        case literal1:
            conjunto de instrucciones 1;
            break;
        case literal1:
            conjunto de instrucciones 1;
            break;
        case literal1:
            conjunto de instrucciones 1;
            break;
        default:
            conjunto de instrucciones por defecto;
            break;
    }
*/

#include <iostream>

using namespace std;

int main(){

    int numero;

    cout<<"Digita un numero entre 1 y 5: "; cin>>numero;

    switch(numero){

        case 1: cout<<"\nEs el numero 1"; break;
        case 2: cout<<"\nEs el numero 2"; break;
        case 3: cout<<"\nEs el numero 3"; break;
        case 4: cout<<"\nEs el numero 4"; break;
        case 5: cout<<"\nEs el numero 5"; break;

        default: cout<<"No esta en el rango de 1-5"; break;
    }

    return 0;
}