//1. Escirbe la siguiente expresion en C++: (a/b) + 1

#include <iostream>
#include <iomanip>

using namespace std;


int main (){

    float a,b, resultado = 0;
    
    cout<<"Digita el valor de a: "; cin>>a;
    cout<<"Digita el valor de b: "; cin>>b;

    resultado = (a/b) + 1;

    cout.precision(2); // Ademas de "FIXED" podemos imprimir decimales de esta manera
    cout<<"\nEl resultado es: "<<resultado<<endl;

    return 0;   
}


