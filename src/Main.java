import com.Ruli.clase.Persona;

import javax.swing.*;

public class Main {
    public static void main(String[] args)
    {
        System.out.println("\n Ya lo vez!" +
                "\n la vida es asi!!" +
                "tú te vas y yo me quedo aquí");
        calcularImc();
    }
    public static void calcularImc() {

Persona primero = new Persona();
primero.setNombre(JOptionPane.showInputDialog("Ingrese su nombre"));
primero.setEstatura(Float.parseFloat(JOptionPane.showInputDialog("Ingrese su estatura")));
primero.setPeso(Float.parseFloat(JOptionPane.showInputDialog("Ingrese su peso")));

JOptionPane.showMessageDialog(null,primero.toString());
    }
}