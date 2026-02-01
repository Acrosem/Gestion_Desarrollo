// Ejercicio 2. Escribe la siguiente expresion : (a+b) / (c+d)

#include <iostream>

using namespace std;

int main(){

    double a,b,c,d,resultado = 0;

    cout<<"Digite a: "; cin >>a;
    cout<<"Digite b: "; cin >>b;
    cout<<"Digite c: "; cin >>c;
    cout<<"Digite d: "; cin >>d;

    resultado = (a+b) / (c+d);

    cout.precision(3);
    cout<<"\nEl resultado es: "<<resultado<<endl;

    return 0;
}