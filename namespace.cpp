#include <iostream>

namespace primero{
    int x=1;
}

namespace segundo{
    int x=2;
}

namespace nickname{
    std::string nombre = "Filo";
}

/*Los namespace se pueden mandar a llamar en cualquir lado 
de la funcion con los prefijos correctos*/

using std::cout;
using std::endl;
using std::string;

int main(){

    using namespace primero;
    using namespace nickname;

    int x =0;

    /*
    En este caso le programa tomara como primera opcion el valor
    de la variable estandar de la funcion principal SIEMPRE Y CUANDO
    no se especifique como tal que otro valor del namespace se
    quiera utilizar
    */
    cout<<"X = "<<segundo::x<<endl;
    cout<<"Hola "<<nombre;

    return 0;
}