package Repaso.Avance_1;

import javax.swing.JOptionPane;

public class Series {

    public static void main(String[] args) {
        Series obj = new Series();

        // Ejemplos de ejecución:
        obj.serie4a40_for();
        obj.serie4a40_while();
        obj.serie4a40_do();

        obj.serie100a70_for();
        obj.serie100a70_while();
        obj.serie100a70_do();

        int numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un número para su tabla de multiplicar:"));
        obj.tabla_for(numero);
        obj.tabla_while(numero);
        obj.tabla_do(numero);

        int n1 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el primer número:"));
        int n2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el segundo número:"));
        obj.serieMenorMayor_for(n1, n2);
        obj.serieMenorMayor_while(n1, n2);
        obj.serieMenorMayor_do(n1, n2);
    }

    // a) Serie del 4 al 40 con incremento de 2
    void serie4a40_for() {
        System.out.println("Serie 4 a 40 con for:");
        for (int i = 4; i <= 40; i += 2) {
            System.out.println(i);
        }
    }

    void serie4a40_while() {
        System.out.println("Serie 4 a 40 con while:");
        int i = 4;
        while (i <= 40) {
            System.out.println(i);
            i += 2;
        }
    }

    void serie4a40_do() {
        System.out.println("Serie 4 a 40 con do-while:");
        int i = 4;
        do {
            System.out.println(i);
            i += 2;
        } while (i <= 40);
    }

    // b) Serie del 100 al 70
    void serie100a70_for() {
        System.out.println("Serie 100 a 70 con for:");
        for (int i = 100; i >= 70; i--) {
            System.out.println(i);
        }
    }

    void serie100a70_while() {
        System.out.println("Serie 100 a 70 con while:");
        int i = 100;
        while (i >= 70) {
            System.out.println(i);
            i--;
        }
    }

    void serie100a70_do() {
        System.out.println("Serie 100 a 70 con do-while:");
        int i = 100;
        do {
            System.out.println(i);
            i--;
        } while (i >= 70);
    }

    // c) Tabla de multiplicar
    void tabla_for(int numero) {
        System.out.println("Tabla de multiplicar con for:");
        for (int i = 1; i <= 10; i++) {
            System.out.println(numero + " * " + i + " = " + (numero * i));
        }
    }

    void tabla_while(int numero) {
        System.out.println("Tabla de multiplicar con while:");
        int i = 1;
        while (i <= 10) {
            System.out.println(numero + " * " + i + " = " + (numero * i));
            i++;
        }
    }

    void tabla_do(int numero) {
        System.out.println("Tabla de multiplicar con do-while:");
        int i = 1;
        do {
            System.out.println(numero + " * " + i + " = " + (numero * i));
            i++;
        } while (i <= 10);
    }

    // d) Serie entre menor y mayor
    void serieMenorMayor_for(int n1, int n2) {
        int menor = Math.min(n1, n2);
        int mayor = Math.max(n1, n2);
        System.out.println("Serie menor a mayor con for:");
        for (int i = menor; i <= mayor; i++) {
            System.out.println(i);
        }
    }

    void serieMenorMayor_while(int n1, int n2) {
        int menor = Math.min(n1, n2);
        int mayor = Math.max(n1, n2);
        System.out.println("Serie menor a mayor con while:");
        int i = menor;
        while (i <= mayor) {
            System.out.println(i);
            i++;
        }
    }

    void serieMenorMayor_do(int n1, int n2) {
        int menor = Math.min(n1, n2);
        int mayor = Math.max(n1, n2);
        System.out.println("Serie menor a mayor con do-while:");
        int i = menor;
        do {
            System.out.println(i);
            i++;
        } while (i <= mayor);
    }
}
