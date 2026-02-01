/*11. Hacer un programa que simule un cajero automatico con un saldo inicial de 1000 dolares*/

#include <iostream>

using namespace std;

int main (){

    int saldo_inicial = 1000, opc, fallos = 0;
    double extra, retiro;
    char continuar;

    do{
    
        cout<<"\t Bienvenido a su Cajero Virtual";
        cout<<"\n1. Ingresar dinero en la cuenta";
        cout<<"\n2. Retirar dinero de la cuenta";
        cout<<"\n3. Revisar saldo";
        cout<<"\n4. Salir";
        cout<<"\nElija una opcion: "; cin>>opc;

        do{

            if((opc <=0) || (opc >=5)){
                cout<<"Digite una opcion valida: "<<endl;
                fallos++;
                cin>>opc;
            }
            
            while(fallos == 3){
                cout<<"Vuelva a intentarlo mas tarde";
                return 0;
            }

        }while((opc <=0) || (opc >=5));
     
        switch(opc){
            case 1: 

                cout<<"Digite la cantidad de dinero que quiere ingresar: ";
                cin>>extra; 
                saldo_inicial += extra;
                cout<<"Dinero en cuenta: "<<saldo_inicial; 
                cout<<"\nDesea realizar otro movimiento ? (s/n): "<<endl; cin>>continuar;
                break;

            case 2: 
                
                cout<<"Digite la cantidad de dinero que quiere retirar: ";
                cin>>retiro;

                if(retiro > saldo_inicial){
                    cout<<"No tiene esa cantidad";
                    cout<<"\nDesea realizar otro movimiento ? (s/n): "<<endl; cin>>continuar;
                } else {
                    saldo_inicial -= retiro;
                    cout<<"Dinero en cuenta: "<<saldo_inicial;
                    cout<<"\nDesea realizar otro movimiento ? (s/n): "<<endl; cin>>continuar; 
                }
                break;

            case 3:
                
                cout<<"Dinero en cuenta: "<<saldo_inicial;
                cout<<"\nDesea realizar otro movimiento ? (s/n): "<<endl; cin>>continuar;
                break;

            case 4:
            
                cout << "\nGracias por usar el cajero. Hasta luego.\n";      
                return 0;
                break;
        }
    
    }while(continuar == 's' || continuar == 'S');    

    cout << "\nGracias por usar el cajero. Hasta luego.\n";
    return 0;
}