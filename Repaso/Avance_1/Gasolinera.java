package Repaso.Avance_1;
import javax.swing.JOptionPane;

public class Gasolinera {
    public static void main(String[] args){
        Gasolinera obj = new Gasolinera();
        obj.cobro();
    }

    double cobro(){
        double litros = 0, total= 0;
        int galon = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantida de galones: "));
        litros = galon * 3.7;
        total = litros * 13.75;
        System.out.println("El total es de: " + total);
        return total;
    }
}