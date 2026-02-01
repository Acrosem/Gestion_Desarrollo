// Ejercicio 3. Escribe la siguiente expresion : (a + (b/c)) / (d + (e/f))

#include <iostream>

using namespace std;

int main(){

    double a,b,c,d,e,f,resultado = 0;

    cout<<"Digite a: "; cin>>a;
    cout<<"Digite b: "; cin>>b;
    cout<<"Digite c: "; cin>>c;
    cout<<"Digite d: "; cin>>d;
    cout<<"Digite e: "; cin>>e;
    cout<<"Digite f: "; cin>>f;

    resultado = (a + (b/c)) / (d + (e/f));

    cout.precision(3);
    cout<<"\nEl resultado es: "<<resultado<<endl;

   return 0;
}