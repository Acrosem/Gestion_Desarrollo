import javax.swing.JOptionPane;

public class Clase13FEB {

    public static void main(String[] args) {
        
        Clase13FEB obj3 = new Clase13FEB();
        
        String cad3 = JOptionPane.showInputDialog(null,"Ingresa la cadena: \n");
        System.out.println(obj3.eje_3(cad3));
        
    }
        
        /*
        3. Desarrolle un metodo que reciba como parametro un cadena, dicho metodo debe imprimir en un solo mensaje:
        A) Si la cadena contiene solamente letras, en caso de ser asi, debe contabilizar,la cantidad de letras vocales
        B) En caso de contar con caracteres distintos a letra debe contabilizar la cantidad de digitos y espacios en blanco
        C) la cadena final debe ser convertida a mayusculas y debe remplazar los espacion en blanco por guiones bajos
        */

        String eje_3(String cad3){
        String mensaje="", aux = cad3.toUpperCase(), modificado="";
        int tam = aux.length(), vocales = 0, blancos = 0, digitos = 0;
        boolean val = true;

        // VERIFICACION SI SON SOLO LETRAS

        for(int i = 0; i<tam; i ++){
            if(!(aux.charAt(i) >= 'A' && aux.charAt(i) <= 'Z')){
                val = false;
                break;
            }
        }
        
        //CONTADORES
        
        if(val==true){
            for(int i = 0; i<tam; i++){
                if(aux.charAt(i)== 'A'||
                   aux.charAt(i)== 'E'||
                   aux.charAt(i)== 'I'||
                   aux.charAt(i)== 'O'||
                   aux.charAt(i)== 'U'){
                vocales++;
                }
                modificado+=aux.charAt(i);
            }
        }else{
            for(int i = 0; i<tam; i++){
                if(aux.charAt(i)>='0' && aux.charAt(i)<='9'){
                    digitos++;
                }else if(aux.charAt(i)==' '){
                    blancos++;
                    modificado+="_";
                }else if (aux.charAt(i)== 'A'||
                   aux.charAt(i)== 'E'||
                   aux.charAt(i)== 'I'||
                   aux.charAt(i)== 'O'||
                   aux.charAt(i)== 'U'){
                vocales++;
                }
                modificado+=aux.charAt(i);
            }
        }

        mensaje = "El mensaje original es: " + cad3 + "\n"
                   + "La cantidad de vocales es: " + vocales + "\n"
                   + "La cantidad de digitos es: " + digitos + "\n"
                   + "La cantidad de espacios en blanco es: " + blancos + "\n"
                   + "La cadena modificada es: " + modificado + "\n";
        return mensaje;
    }
}
