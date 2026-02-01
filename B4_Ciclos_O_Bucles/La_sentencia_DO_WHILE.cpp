/*
La sentencia DO WHILE

    do{
        conjunto de instrucciones
    }
    while();

*/

#include <iostream>
#include <stdlib.h> //Esta libreria hace la misma funcion que "CONIO.H"

using namespace std;

int main(){

    int i = 1;

     do{

        cout<<i<<endl;
        i++; //aumenta en iterador de 1 en 1

     }while(i <= 10);

     system("pause"); //Realiza la misma funcin de getch
     return 0;

}
