/*Escriba un programa que lea de la entrada estadar los dos catetos de un triangulo
rectangulo y escriba en la salida estandar su hipotenusa*/

#include <iostream>
#include <iomanip>
#include <cmath>

using namespace std;

int main(){

    double cat1,cat2,h = 0;

    cout<<"Digite el primer cateto: "; cin>>cat1;
    cout<<"Digite el segundo cateto: "; cin>>cat2;

    h =sqrt(pow(cat1,2) + pow(cat2,2));
    
    cout<<"\nLa hipotenusa es: "<<fixed<<setprecision(3)<<h<<endl;

    return 0;
}