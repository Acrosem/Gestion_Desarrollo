/*Escriba un programa que calcule las solucuiones de una ecuacion de segudo grado de la 
forma ax^2 + bx + c = 0, teniendo en cuenta que: x = (-b) +- sqrt((b^2)-(4ac))/ (2a)*/

#include <iostream>
#include <iomanip>
#include <math.h>

using namespace std;

int main(){

    double a,b,c,x1 = 0, x2 = 0, resultado1 = 0,resultado2 = 0 ;

    cout<<"Digite el valor de a: "; cin>>a;
    cout<<"Digite el valor de b: "; cin>>b;
    cout<<"Digite el valor de c: "; cin>>c;

    x1 = ((-b) + (sqrt(pow(b,2) - 4 * (a*c)))) / (2 * (a));
    x2 = ((-b) - (sqrt(pow(b,2) - 4 * (a*c)))) / (2 * (a));

    cout<<"\nEl valor de x1 es: "<<fixed<<setprecision(2)<<x1<<endl;
    cout<<"\nEl valor de x2 es: "<<fixed<<setprecision(2)<<x2<<endl;

    resultado1 = ((a) * pow(x1,2)) + b * (x1) + c;
    resultado2 = ((a) * pow(x2,2)) + b * (x2) + c;


    cout.precision(2);
    cout<<"\nEl resultado1 es: "<<fixed<<setprecision(2)<<resultado1<<endl;
    cout<<"\nEl resultado2 es: "<<fixed<<setprecision(2)<<resultado2<<endl;

    return 0;
}