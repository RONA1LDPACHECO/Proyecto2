package paquete2;

import javax.swing.JOptionPane;

public class ejercicio02 
{
    public static void main(String[] args)
    {
        int opcion=0; String op="";
        op=JOptionPane.showInputDialog("Seleccione una Opcion: \n"
                + " 1.- suma\n"
                + " 2.- resta\n"
                + " 3.- multiplicacion\n");
        opcion=Integer.parseInt(op);
        switch(opcion)
        {
            case 1: JOptionPane.showMessageDialog(null,"Eligio la Primera Opcion");break;
            case 2: JOptionPane.showMessageDialog(null,"Eligio la Segunda Opcion");break;
            case 3: JOptionPane.showMessageDialog(null,"Eligio la Tercera Opcion");break;          
    }
        System.exit(0);
        }
}
