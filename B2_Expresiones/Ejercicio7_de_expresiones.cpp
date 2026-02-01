/*7. La calificacion final de un estudiante es la media ponderada de tres notas:
La nota practica que cuenta con un 30% del total, La nora teórica que cuenta que cuenta un 60%
y la nota de participacion que cuenta con el 10% restante.
Escriba un programa que lea las tres notas de la entrada estandar las tres notas de un alumno
y esscriba en la salida estandar su nota final. **/

#include <iostream>
#include <iomanip>

using namespace std;

int main(){

    double practica,teorica,participacion,nf = 0;

    cout<<"Digite la nota de practica: ";        cin>>practica;
    cout<<"Digite la nota de teorica: ";         cin>>teorica;
    cout<<"Digite la nota de participacion: ";   cin>>participacion;

    practica *= 0.30; // Esto es igua a esto "practica = practica * 0.30"
    teorica *= 0.60;
    participacion *= 0.10;

    nf = practica + teorica + participacion;

    cout.precision(2);
    cout<<"\nLa nota final es: "<<nf<<endl;

    return 0;
}