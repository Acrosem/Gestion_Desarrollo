import javax.swing.JOptionPane;

public class Actividad2_1 {
    
    public static void main(String[] args){
        
        /*
        String entrada = JOptionPane.showInputDialog(null, "Ingrese la edad: \n");
        int edad = Integer.parseInt(entrada);
        */

        /*
        String entrada = JOptionPane.showInputDialog(null, "Ingrese la edad: \n");
        int edad = Integer.parseInt(entrada);
        */

        /*
        String entrada = JOptionPane.showInputDialog(null, "Ingrese una letra: \n");
        if(entrada.length() > 1){
            System.out.println("Ingrese solamente una letra");
        }
        char letra = entrada.charAt(0);
        */


        Actividad2_1 obj = new Actividad2_1();
        
        //obj.validarEdad(edad);
        //obj.votacion(edad);
        //obj.vocal_consonante(letra);
        //obj.repite();
        //obj.repite_solicitar();
        //obj.repite_do();
        //obj.repite_do_sol();
        //obj.contar_mayores_100();
        obj.suma_numeros();
    }

    /* Método que reciba
    como parámetro una edad,
    dicho método debe validar si dicha
    edad corresponde a una persona menor o
    mayor de edad. */

    void validarEdad(int edad){
        if(edad >= 18){
            System.out.println("Es mayor de edad");
        } else {
            System.out.println("No es mayor de edad");
        }
    }

    /*Método que reciba como
    parámetro una edad, dicho
    método debe validar si una
    persona puede o no votar,
    considerando que debe ser
    mayor de edad . Además
    supongamos que
    manejaremos un rango de
    edades válido, en donde no
    existen edades negativas ni
    iguales a cero y que la edad
    máxima es de 100 años.*/

    void votacion(int edad){
        if(edad >=1 && edad <= 100){
            if(edad >= 18){
                System.out.println("Puede votar");
            } else {
                System.out.println("No puede votar");
            }
        }else{
            System.out.println("Edad incorrecta");
        }
    }

    /*Método que reciba como
    parámetro una letra,
    determinar si dicha letra
    es una vocal o consonante. */

    void vocal_consonante(char letra){
        int aski = (int) letra;
            if(aski >= 97 || aski >= 101 || aski >= 105 || aski >= 111 || aski >= 117){
                    switch (letra) {
                    case 'a':
                    System.out.println("Letra " + letra + " es vocal");
                    break;
                    case 'e':
                    System.out.println("Letra " + letra + " es vocal");
                    break;
                    case 'i':
                    System.out.println("Letra " + letra + " es vocal");
                    break;
                    case 'o':
                    System.out.println("Letra " + letra + " es vocal");
                    break;
                    case 'u':
                    System.out.println("Letra " + letra + " es vocal");
                    break;
                    }
            }else{
                    System.out.println("Es consonante");
            }
            
    }
    
    /*
    Método que imprime 5 veces
    una cadena de texto.
    */

    void repite(){
        String frase = "Inmortal Dreams";
        for(int i = 0; i < 5; i++){
            System.out.println(frase);
        }
    }

    /*
    Método que imprime 5 veces
    una cadena de texto.
    */

    void repite_w(){
        String frase = "Inmortal Dreams";
        int a = 1;
    while (a<=5) {
        System.out.println(frase);
        a += 1;
    }
    }

    /*
    Método que imprime una
    cadena de texto mientras el
    usuario lo solicite.
    */

    void repite_solicitar(){
        String frase = "Inmortal Dreams";
        int a = 1;
        while (a == 1) {
            System.out.println(frase);
            a = Integer.parseInt(JOptionPane.showInputDialog(
                "Deseas imprimir de nuevo:\n 1.Yes \n2.Nop"
                ));
        }
    }

    /*
    Método que imprime 5 veces
    una cadena de texto.
    */

    void repite_do(){
        String frase = "Inmortal Dreams";
        int a = 1;
        do{
           System.out.println(frase);     
           a++;
        }while(a <=5);
    }

    /*
    Método que imprime una
    cadena de texto mientras el
    usuario lo solicite.
    */

    void repite_do_sol(){
        String frase = "Inmortal Dreams";
        int a = 1;
        do{
           System.out.println(frase);
            a = Integer.parseInt(JOptionPane.showInputDialog(
                "Deseas imprimir de nuevo:\n 1.Yes \n2.Nop"
                ));
        }while(a == 1);
    }
    
    /*
    Método que recibe 10
    números de tipo entero
    introducidos por el usuario,
    dicho metodo determina
    cuantos de esos números son
    mayores a 100.
    */

    int contar_mayores_100(){
        int contador = 0, acumulador = 0;
        for(int x = 1; x <= 10; x++){
            acumulador = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el numero " + x + ": "));
            if(acumulador > 100){
                contador ++;
            }
        }
        System.out.println("Los numeros mayores a 100 son: " + contador);
        return contador;
    }

    /*
    Método que recibe 5
    números de tipo entero
    introducidos por el usuario,
    dicho metodo determina la
    suma total de los valores
    ingresados.
    */

    double suma_numeros(){
        double suma = 0, acumulador = 0;
        for(int x = 1; x <= 5; x++){
            acumulador = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el numero " + x + ": "));
            suma += acumulador;
        }
        System.out.println("La suma de los numeros es: " + suma);
        return suma;
    }
}


