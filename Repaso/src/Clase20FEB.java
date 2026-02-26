import javax.swing.JOptionPane;

public class Clase20FEB {

    public static void main(String[] args) {
        Clase20FEB obj = new Clase20FEB();
        String cad = JOptionPane.showInputDialog(null, "Ingresa el correo: ");
        System.out.println(obj.correo(cad));
    }
    
/*
Validar la estructura de un email; Esta compuesto por dos bloques
Usuario (a-z, 0-9, '_', '-', '.')
Dominio (a-z, '.')

--Verificar si es un dominio comercial--
gmail.com
hotmail.com
outlook.com
live.com
yahoo.com
-Otro
*/

/*
    Piensa en la estructura de un correo:
    1. Lo primero que debemos verificar es si tiene un arroba (@). Si tiene mas de una arroba no es valido,
    por eso necesitamos un contador de arrobas, si ese contando es diferente de 1, no pasa. si es es igual pasa
    2. Despues debemos determinar si tiene o no espacios
    3. Una vez teniendo la posicion del arroba, debemos asignar a las variables el usuario y el dominio
    4. Despues debemos validar que tanto el usuario como el dominio cumplan las condiciones 
    5. AL final debemos de la comprobacion de que tanto como el usuario como el domino sean true o validos
    para poder asignar al mensaje que "Es un correo valido"
    */

    String correo(String cad){
    String mensaje = "", aux = cad.toLowerCase(), user = "", dominio = "";
    int tam = aux.length(), cont_a = 0, pos = 0;
    boolean val_u = false, val_d = false;

    for(int i = 0; i < tam; i ++){
        if(aux.charAt(i)=='@'){
            pos = i;
            cont_a++;
        }else if(aux.charAt(i)==' '){
            mensaje = "El correo no es valido";
            break;
        }
    }

    if(cont_a != 1){
    return "Correo no valido";
    }   

    for(int i = 0; i < pos; i ++){
        user += aux.charAt(i);
        if((user.charAt(i)>= 'a' && user.charAt(i)<= 'z') 
            || (user.charAt(i)>= '0' && user.charAt(i)<= '9') 
            || (user.charAt(i)=='_')
            || ((user.charAt(i)=='-')
            || ((user.charAt(i)=='.')))){
                val_u= true;
        }
        else{
            val_u= false;
        }
    }

    for(int i = pos + 1; i < aux.length(); i ++){
        dominio += aux.charAt(i);
        if(dominio.equals("gmail.com")
            ||dominio.equals("hotmail.com")
            ||dominio.equals("outlook.com")
            ||dominio.equals("live.com")
            ||dominio.equals("yahoo.com")
        ){
                val_d= true;
        }else{
            val_d = false;
        }
    }

    if(val_d && val_u){
        mensaje = "Correo valido";
    }else{
        mensaje = "ERROR!!! Correo no valido";
    }

    return mensaje;
    }
    
}