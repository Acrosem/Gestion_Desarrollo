/*Crea un sistema donde puedas igresar el numero de respuestas correctas qur obtuvo
un alumno en un examen y despues dar el porcentaje obtenido en la prueba*/

#include <iostream>

using std::cout;
using std::cin;
using std::endl;

int main(){

    int aciertos = 8;
    int total_de_preguntas = 10;

    cout<<"Ingresa el numero de aciertos: "; cin>>aciertos;
    double total = (aciertos * 100) / (double)total_de_preguntas;
    cout<<total<<"%";
    
    return 0;
}