/*Realice un programa que calcule el valor que toma la siguiente funcion para unos valores
dados de x e y*/

#include <iostream>
#include <iomanip>
#include <math.h>

using namespace std;

int main(){

    double x,y,res = 0;

    cout<<"Digite x: "; cin>>x;
    cout<<"Digite y: "; cin>>y;

    res= (sqrt(x))/(pow(y,2) - 1);

    cout.precision(3);
    cout<<"\nEl resultado es: "<<fixed<<setprecision(3)<<res<<endl;

    return 0;
}



