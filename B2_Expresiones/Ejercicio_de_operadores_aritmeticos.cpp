// Ejercicio de operaciones aritmeticas

/*Escribe un porgrama que lea de la entrada estandar el precio de un producto y muestre
en la salida estadar el precio del prodccucto al aplicarle el IVA*/

#include <iostream>
#include <iomanip>

using namespace std;

int main (){

    double pruducto,IVA = 0;

    cout<<"Digite el precio del producto: "; cin>>pruducto;

    IVA=pruducto + (pruducto * 0.17);

    cout<<"\nEl precio del producto es "<<fixed<<setprecision(3)<<IVA<<endl;

    return 0;
}