/*Escribe un programa que lea de la entrada estandar tres numeros. Despues debe leer 
un cuarto numero e indicar si el numero coincide con alguno de los introduciodos con
anterioridad*/

#include <iostream>

using namespace std;

int main(){

    int n1,n2,n3,n4;

    cout<<"Digite tres numeros: "; cin>>n1>>n2>>n3;

    cout<<"Digite otro numero: "; cin>>n4;

    if(n4 == n1){
        cout<<"El numero es ighual a n1";
    }else if(n4 == n2){
        cout<<"El numero es ighual a n2";
    }else if(n4 == n3){
        cout<<"El numero es ighual a n3";
    }else{
        cout<<"El numero no coincide con ninguno";
    }        

    return 0;
}