// Ejercicio 4. Escribe la siguiente expresion : a + (b / (c-d))

#include <iostream>
#include <iomanip>

using namespace std;

int main(){

    double a,b,c,d,res = 0;

    cout<<"Digita a: ", cin>>a;
    cout<<"Digita b: ", cin>>b;
    cout<<"Digita c: ", cin>>c;
    cout<<"Digita d: ", cin>>d;

    res= a + (b / (c-d));

    cout<<"El resultado es: "<<fixed<<setprecision(3)<<res<<endl;

    return 0;
}