/*12. Hacer un menu que considere las siguientes opciones

Caso 1: Cubo de un numero
Caso 2: Numero par o impar    
Caso 3: Salir
*/

#include <iostream>
#include <iomanip>
#include <math.h>

using namespace std;

int main (){

    int num, resultado = 0, opcion = 0;

    cout<<"Digite un numero: "<<endl; cin>>num;

    cout<<"\tMenu de operaciones"<<endl;
    cout<<"\n1. Cubo de un numero"<<endl;
    cout<<"\n2. Numero par o impar"<<endl;
    cout<<"\n3. Salir"<<endl;

    cout<<"\nEliga la operacion que desea realizar: "<<endl; cin>>opcion;

    switch(opcion){
        
        case 1:
        resultado = pow(num,3);
        cout.precision(3);
        cout<<"El cubo de un numero es: "<<fixed<<setprecision(3)<<resultado<<endl;
        break;       
        
        case 2:
        if(num%2 == 0){
            cout<<"El numero es par";
        }else{
            cout<<"El numero es impar";
        }
        break;

        case 3:
        return 0;
        break;

    }
    return 0;
}   