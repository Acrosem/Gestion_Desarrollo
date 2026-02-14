import javax.swing.JOptionPane;

/**
 *
 * @author Lab D-105
 */
public class Cadenas {

    public static void main(String[] args) {
        String s = "hola";
        System.out.println(s);
        //Concaternar cadenas
        s=s.concat(" mundo");
        System.out.println(s);
        //Mayuscualas
        s=s.toUpperCase();
        System.out.println(s);
        //Minusculas
        s=s.toLowerCase();
        System.out.println(s);
        //Agregar
        s=s + (" cruel");
        System.out.println(s);
        //Remplazar caracter
        s=s.replace("o", "x");
        System.out.println(s);
        //Cantidad de caracteres de una cadena
        int tam=s.length();
        System.out.println("Longitud " + tam);
        //Extraer la letra de un caracter
        char letra = s.charAt(2);
        System.out.println("La letra es: " + letra);
        
        //Recorrer una cadena
        for (int x=0; x < tam; x++ ) {
            
            if (s.charAt(x) == 'a') {
                System.out.println("Posicion : " + (x+1) + " contiene a");
            } 
        }
        
        //Sub indices
        String aux=s.substring(3);
        System.out.println(aux);
        String aux2=s.substring(2,5); //Delimitar el sub indice
        System.out.println(aux2);
        
        String cadena_1="hola";
        String cadena_2="HOLA";
        
        //Cuando es "equals" deben ser exactamente igual
        if (cadena_1.equals(cadena_2)) {
            System.out.println("son iguales");
        }else{
            System.out.println("No son iguales");
        }
        //Cuando es "equalsIsIgnoreCase" no deben de ser exactamente iguales
        if (cadena_1.equalsIgnoreCase(cadena_2)) {
            System.out.println("son iguales");
        }else{
            System.out.println("No son iguales");
        }
        
        String cadena_3="assemgrave";
        String cadena_4="ASSEMGRAVE";
        
        System.out.println(cadena_3.endsWith("x")); //Verifica si termina en x
        System.out.println(cadena_4.endsWith("E")); //Verifica si termina en E 
        
        /*
        1. Desarrolla un metodo que reciba como parametro una cadena, dicho metodo debe obtener e imprimir en un solo
        mensaje:
        A) La cadena original en mayusculas
        B) Tamaño real de la cadena
        C) Reemplazar los espacios en blanco por una "x" (no usar la funcion de replace)
        */
        
        //Cadenas obj = new Cadenas();
        
        //String cad = JOptionPane.showInputDialog(null,"Ingresa la cadena: \n");
        //System.out.println(obj.eje_1(cad));
        
        /*
        Desarrolle un metodo que reciba como parametro una cadena, dicho metodo de deber obtener e imprimir en un solo mensaje:
        A) La cadena original en minisculas
        B) Contar la cantidad de letras y digitos que contiene
        C) Validar y mostrar si la cadena termina o no con cualquiera de los siguientes caracteres:
            -Punto (.)
            -Coma (,)   
            -Punto y coma (;)
        */

        Cadenas obj2 = new Cadenas();
        
        String cad2 = JOptionPane.showInputDialog(null,"Ingresa la cadena: \n");
        System.out.println(obj2.eje_2(cad2));
        
    }

    String eje_1(String cad){
        String mensaje = "";
        String aux = cad.toUpperCase();
        int tam=aux.length();
            for (int i = 0; i<tam; i++) {
                if (aux.charAt(i)==' ') {
                    mensaje = mensaje + "x";
                }else{
                    mensaje=mensaje + aux.charAt(i);
                }
            }
            System.out.println("La cadena original es: " + aux + "\n"
                + "La cadena modificada es: " + mensaje
            );
        return mensaje;    
        }

        String eje_2(String cad2){
        String mensaje = "";
        String aux = cad2.toLowerCase();
        int cant_l = 0, cant_d = 0, tam=cad2.length();
        for(int i=0; i<tam; i++){
            if(cad2.charAt(i)>='a' && cad2.charAt(i)<='z'){
                cant_l++;
            }else if(cad2.charAt(i)>='0' && cad2.charAt(i)<='9'){
                cant_d++;
            }
        }

        String terminacion;
        if(cad2.charAt(tam-1)=='.' || cad2.charAt(tam-1)==',' || cad2.charAt(tam-1)==';'){
                terminacion= "La cadena termina con caracter";
            }else{
                terminacion= "La cadena termina NO con caracter";
            }

        mensaje= ("La cadena original es: " + cad2 + "\n"
            + "La cadena modificada es: " + aux + "\n"
            + "La cantidad de letras es: " + cant_l + "\n"
            + "La cantidad de digitos es: " + cant_d + "\n"
            + terminacion
        );
        return mensaje;    
        }
}
