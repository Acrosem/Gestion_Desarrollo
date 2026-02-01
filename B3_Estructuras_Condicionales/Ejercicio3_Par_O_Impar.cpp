/*Realice un programa que lea un valor entero y determine si se trata de un numero par
o impar*/

#include <iostream>

using namespace std;

int main(){

    int num;

    cout<<"Digite un numero: "; cin>>num;

    if(num == 0){
        cout<<"El numero es igual a 0";
    } else if(num%2 == 0){
        cout<<"El nuemero es par";
    }else{
        cout<<"El nuemero es impar";
    }

    return 0;
}