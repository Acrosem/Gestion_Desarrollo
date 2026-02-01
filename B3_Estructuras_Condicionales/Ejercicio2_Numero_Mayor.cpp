/*Esciba un programa que lea tres numeros y que determine cual de ellos es el mayor*/

#include <iostream>

using namespace std;

int main(){
    
    int a,b,c;

    cout<<"Digite 3 numeros: "; cin>>a>>b>>c;

    if((a>b)&&(a>c)){
		cout<<"El mayor es: "<<a;
	}
	else if((b>a)&&(b>c)){
		cout<<"El mayor es: "<<b;
	}
	else{
		cout<<"El mayor es: "<<c;
	}

    return 0;
}
