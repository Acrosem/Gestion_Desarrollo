/*Crea un programa que lea el nombre completo del usuario y su edad y la imprima
en panatalla*/

#include <iostream>

int main(){

    std::string nombre;
    int edad = 0;

    std::cout<<"Nombre completo: "<<"\n"; 
    std::getline(std::cin>>std::ws, nombre); //Funcion getlines para strings con espacios      
    std::cout<<"Edad: "<<"\n"; 
    std::cin>>edad;      

    std::cout<<"Hola "<<nombre<<"\n";
    std::cout<<"Tienes "<<edad<<" años";

    return 0;
}