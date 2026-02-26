import javax.swing.JOptionPane;

public class Clase19FEB {

    public static void main(String[] args) {
        Clase19FEB obj = new Clase19FEB();
        String cad = JOptionPane.showInputDialog(null,"Ingresa la cadena: \n");
        System.out.println(obj.pal(cad));
    }
    
    /*
    Desarrolla un metodo que reciba como parametro una cadena, dicho metodo debe de determinar si una palabra es palindroma o no,
    considere lo siguiente:
    1. Validar que la cadena contenga solo letras y/o espacios en blanco
    2. Transforme la cadena a mayuscula
    3. elimine y contabilice la cantidad de espacios en blanco que contiene la cadena
    */
    String pal(String cad){
    String mensaje = "", aux = cad.toUpperCase(),aux_1="", aux_2="";
    int tam = aux.length(), espacios = 0;
    boolean val  = false;
    
        for (int i = 0; i < tam; i++) {
            if ((aux.charAt(i)>= 'A' && aux.charAt(i)<= 'Z') || aux.charAt(i)==' ') {
                aux_1 += aux.charAt(i);
                val = true;
            }else{
                val = false;
                break;
            }
        }

        if (val==true) {

            for (int i = 0; i < tam; i++) {
                if (aux_1.charAt(i)==32) {
                    espacios++;
                }
            }

            aux_1=aux_1.replace(" ","");
            
            for (int i = aux_1.length() - 1; i >=0 ; i--) {
                aux_2 += aux_1.charAt(i);
            }
            if (aux_1.equals(aux_2)) {
                System.out.println("Son palindromas");
            }else{
                System.out.println("No son palindromas");
            }
        }
        
        mensaje = "La cadena origial es: " + cad + "\n"
                + "La cantidad de espacios es: " + espacios + "\n"
                + "La cadena modificada es: " + aux_1;
    return mensaje;
    }
}
