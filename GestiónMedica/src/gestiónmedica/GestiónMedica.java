package gestiónmedica;

import javax.swing.JOptionPane;

public class GestiónMedica {

    public static void main(String[] args) {
        String Nombre1, Nombre2, Apellido1, Apellido2, Teléfono, Dirección;
        int Documento;
        JOptionPane.showMessageDialog(null,"BIENVENIDO");
        Documento=Integer.parseInt(JOptionPane.showInputDialog("Digite su número de documento"));
        Nombre1=JOptionPane.showInputDialog("Ingrese su primer nombre");
        Nombre2=JOptionPane.showInputDialog("Ingrese su segundo nombre");
        Apellido1=JOptionPane.showInputDialog("Ingrese su primer apellido");
        Apellido2=JOptionPane.showInputDialog("Ingrese su segundo apellido");
        Teléfono=JOptionPane.showInputDialog("Ingrese su número de teléfono");
        Dirección=JOptionPane.showInputDialog("Ingrese su Dirección");
        
    }

}
