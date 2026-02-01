package Repaso.Avance_1;

import javax.swing.JOptionPane;

public class Menus {

    public static void main(String[] args) {
        Menus obj = new Menus();

        obj.operaciones_do();
        obj.areas_do();
    }

    void operaciones_do() {
        int opcion;
        do {
            opcion = Integer.parseInt(JOptionPane.showInputDialog(
                "1. Suma\n" +
                "2. Resta\n" +
                "3. Multiplicación\n" +
                "4. División\n" +
                "5. Salir\n"
            ));

            if (opcion >= 1 && opcion <= 4) {
                int a = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el primer número:"));
                int b = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el segundo número:"));

                switch (opcion) {
                    case 1: JOptionPane.showMessageDialog(null, "Resultado: " + (a + b)); break;
                    case 2: JOptionPane.showMessageDialog(null, "Resultado: " + (a - b)); break;
                    case 3: JOptionPane.showMessageDialog(null, "Resultado: " + (a * b)); break;
                    case 4: 
                        if (b != 0) {
                            JOptionPane.showMessageDialog(null, "Resultado: " + ((double)a / b));
                        } else {
                            JOptionPane.showMessageDialog(null, "No se puede dividir entre cero");
                        }
                        break;
                }
            }
        } while (opcion >=1 && opcion <=4);
    }

    void areas_do() {
        int opcion;
        do {
            opcion = Integer.parseInt(JOptionPane.showInputDialog(
                "1. Área del cuadrado\n" +
                "2. Área del rectángulo\n" +
                "3. Área del triángulo\n" +
                "4. Área del círculo\n" +
                "5. Salir\n" 
            ));

            switch (opcion) {
                case 1: {
                    double lado = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el lado del cuadrado:"));
                    JOptionPane.showMessageDialog(null, "Área del cuadrado: " + (lado * lado));
                } break;
                case 2: {
                    double base = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la base del rectángulo:"));
                    double altura = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la altura del rectángulo:"));
                    JOptionPane.showMessageDialog(null, "Área del rectángulo: " + (base * altura));
                } break;
                case 3: {
                    double base = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la base del triángulo:"));
                    double altura = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la altura del triángulo:"));
                    JOptionPane.showMessageDialog(null, "Área del triángulo: " + ((base * altura) / 2));
                } break;
                case 4: {
                    double radio = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el radio del círculo:"));
                    JOptionPane.showMessageDialog(null, "Área del círculo: " + (Math.PI * radio * radio));
                } break;
            }
        } while (opcion >=1 && opcion <=4);
    }
}
