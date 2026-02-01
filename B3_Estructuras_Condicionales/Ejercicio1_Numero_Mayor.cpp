/*Escriba un programa que lea dos numeros y determine cual de ellos es el mayor*/

#include <iostream>

using namespace std;

int main(){

    int x,y;

    cout<<"Digite el valor de x: "; cin>>x;
    cout<<"Digite el valor de y: "; cin>>y;

    if(x == y){
        cout<<"Los numeros son iguales";
    }
    else if(x > y){
        cout<<"El numero mayor es:"<<x;
    }else{
        cout<<"El numero mayor es:"<<y;
    }

    return 0;
}