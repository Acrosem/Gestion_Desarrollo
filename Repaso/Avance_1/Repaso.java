package Repaso.Avance_1;

import javax.swing.JOptionPane;

public class Repaso {

    public static void main(String[] args) {
        Repaso obj = new Repaso();

        int numero1 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un número:"));
        obj.mayor_a_100(numero1);

        int numero2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese otro número:"));
        obj.menor_a_10(numero2);

        int n1 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el primer número:"));
        int n2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el segundo número:"));
        obj.iguales(n1, n2);

        int valor = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un número para determinar su naturaleza:"));
        obj.naturaleza_del_valor(valor);

        char sexo = JOptionPane.showInputDialog("Ingrese el ID de sexo (F/M):").charAt(0);
        obj.define_sexo(sexo);

        char especialidad = JOptionPane.showInputDialog("Ingrese la clave de especialidad (S/R/D):").charAt(0);
        obj.especialidad_TIC(especialidad);
    }

    // Método #1
    void mayor_a_100(int numero) {
        if (numero > 100) {
            System.out.println("Mayor a 100");
        } else {
            System.out.println("Menor o igual a 100");
        }
    }

    // Método #2
    void menor_a_10(int numero) {
        if (numero < 10) {
            System.out.println("Menor a 10");
        } else {
            System.out.println("Mayor o igual a 10");
        }
    }

    // Método #3
    void iguales(int num1, int num2) {
        if (num1 == num2) {
            System.out.println("Son iguales");
        } else {
            System.out.println("Distintos");
        }
    }

    // Método #4
    void naturaleza_del_valor(int numero) {
        if (numero == 0) {
            System.out.println("Neutro");
        } else if (numero > 0) {
            System.out.println("Positivo");
        } else {
            System.out.println("Negativo");
        }
    }

    // Método #5
    void define_sexo(char id) {
        switch (id) {
            case 'F':
            case 'f':
                System.out.println("Sexo Femenino");
                break;
            case 'M':
            case 'm':
                System.out.println("Sexo Masculino");
                break;
            default:
                System.out.println("Sexo Indefinido");
                break;
        }
    }

    // Método #6
    void especialidad_TIC(char clave) {
        switch (clave) {
            case 'S':
            case 's':
                System.out.println("Sistemas Informáticos");
                break;
            case 'R':
            case 'r':
                System.out.println("Redes y Telecomunicaciones");
                break;
            case 'D':
            case 'd':
                System.out.println("Diseño Digital");
                break;
            default:
                System.out.println("No existe especialidad");
                break;
        }
    }
}
