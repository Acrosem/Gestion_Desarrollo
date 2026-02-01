/*6. Escriba un programa que lea la nota final de cuatro alumnos y calcule la nota final media de los cuatro alumnos*/

#include <iostream>
#include <iomanip>

using namespace std;

int main(){

    double n1,n2,n3,n4,media = 0;

    cout<<"Digite la nota del primer alumno: "; cin>>n1;
    cout<<"Digite la nota del segundo alumno: "; cin>>n2;
    cout<<"Digite la nota del tercer alumno: "; cin>>n3;
    cout<<"Digite la nota del cuarto alumno: "; cin>>n4;

    media = (n1 + n2 + n3 + n4) / 4;

    cout<<"\nLa nota media de los alumnos es: "<<fixed<<setprecision(3)<<media<<endl;
    
    return 0;
}