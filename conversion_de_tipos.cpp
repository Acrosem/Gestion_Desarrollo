#include <iostream> 

namespace caracter{
    char x = 100; //Conversion implicita numero => ASKI
}

int main(){

    using namespace caracter;

    int x = (int)3.14; //Conversion de datos explicitas 
    std::cout<<(char)100; //Conversion explicita
    
    return 0;
}