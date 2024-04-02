package principal;

import javax.swing.JOptionPane;
import model.Circulo;

public class Principal {

    public static void main(String[] args) {
        //Declara e instancia o círculo
        Circulo tri1 = new Circulo();

        //Entrada
        tri1.setRaio(Double.parseDouble(JOptionPane.showInputDialog("Digite o raio")));

        //Saída
        JOptionPane.showMessageDialog(null, "A área do círculo é " + tri1.getArea());
    }
}