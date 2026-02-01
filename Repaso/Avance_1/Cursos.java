package Repaso.Avance_1;

import javax.swing.JOptionPane;

public class Cursos {
        
    public static void main(String[] args) {
        Cursos obj = new Cursos();        
        obj.precio(); 
    }

    void precio(){
        int personas;
        double precio_curso_p, pago_original = 1000, descuento, pago_final;

        personas = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el número de personas:"));
        precio_curso_p = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el precio por persona:"));        

        double pago_total = personas * precio_curso_p;
        descuento = pago_total * 0.12;
        pago_final = pago_total - descuento;

        JOptionPane.showMessageDialog(null, 
            "Pago original: $" + pago_original +
            "\nDescuento: $" + descuento +
            "\nPago final: $" + pago_final);
    }
}
