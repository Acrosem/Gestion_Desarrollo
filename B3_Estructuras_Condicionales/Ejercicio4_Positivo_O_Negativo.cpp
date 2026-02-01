/*Comprobar si un numero digitado por el usuario es positivo o negativo*/

#include <iostream>

using namespace std;

int main(){

    double num;

    cout<<"Digite un numero: "; cin>>num;

    if(num == 0){
        cout<<"El numero es cero";
    }else if(num > 0){
        cout<<"El numero es positivo";
    }else{
        cout<<"El numero es negativo";
    }

    return 0;
}