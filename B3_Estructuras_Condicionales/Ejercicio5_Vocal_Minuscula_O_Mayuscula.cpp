/*Escriba un programa que lea de la entrada estandar un caracter e indiqueen la salida
estandar si el caracter es una vocal miniscula o no*/

#include <iostream>

using namespace std;

int main(){
    
    char letra;

    cout<<"Digite una letra: "; cin>>letra;

    switch(letra){
        case 'a':
        case 'e':
        case 'i':
        case 'o':
        case 'u': cout<<"Es una vocal minuscula"; break;
        default: cout<<"NO es una vocal minuscula"; break;
    }

    return 0;
}