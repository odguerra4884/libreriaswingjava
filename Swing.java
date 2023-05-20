/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package swing;
import javax.swing.ImageIcon;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Color;
import java.util.Arrays;
/**
 *
 * @author LATITUDE
 */
public class Swing {

    
     public static void main(String[] args) {
        // Crear un JFrame como ventana principal
        JFrame frame = new JFrame("Osmar Guerra");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new FlowLayout());
        

        // JLabel
        JLabel label = new JLabel("Que necesita:");
        frame.add(label);

        // JTextField
        JTextField textField = new JTextField(20);
        frame.add(textField);

        // JButton
        JButton button = new JButton("Visualizar");
        frame.add(button);

        // JCheckBox
        JCheckBox checkBox = new JCheckBox("Casilla de verificación");
        frame.add(checkBox);

        // JRadioButton
        
        JRadioButton radioButton1 = new JRadioButton("Bandera ");
        JRadioButton radioButton2 = new JRadioButton("DE ");
        JRadioButton radioButton3 = new JRadioButton("GUATEMALA");
        radioButton1.setForeground(Color.white);
        radioButton2.setForeground(Color.red);
        radioButton3.setForeground(Color.white);
        ButtonGroup radioButtonGroup = new ButtonGroup();
        radioButtonGroup.add(radioButton1);
        radioButtonGroup.add(radioButton2);
        radioButtonGroup.add(radioButton3);
        frame.add(radioButton1);
        frame.add(radioButton2);
        frame.add(radioButton3);
       
radioButton1.setBackground(Color.blue);
radioButton2.setBackground(Color.white);
radioButton3.setBackground(Color.blue);


        // JComboBox
        String[] options = {"Puerto Barrios", "Zacapa", "ipala"};
        JComboBox<String> comboBox = new JComboBox<>(options);
        frame.add(comboBox);

        // JList
        String[] items = {"Jalapa 1", "Chiquimula 2", "Izabal 3"};
        JList<String> list = new JList<>(items);
        frame.add(list);
        
        // Agregar un ActionListener al botón
             button.addActionListener((ActionEvent e) -> {
            String inputText = textField.getText();
            StringBuilder mensaje = new StringBuilder();
            mensaje.append("Texto ingresado: ").append(inputText).append("\n");
            mensaje.append("Casilla de verificación: ").append(checkBox.isSelected() ? "Seleccionada" : "No seleccionada").append("\n");
            mensaje.append("Ubicacion: ").append(radioButton1.isSelected() ? "Direccion" : (radioButton2.isSelected() ? "DE" : "GUATEMALA")).append("\n");
            mensaje.append("Municipio: ").append(comboBox.getSelectedItem()).append("\n");
            mensaje.append("Departamento: ").append(Arrays.toString(list.getSelectedValuesList().toArray()));

            JOptionPane.showMessageDialog(frame, mensaje.toString());
        });

        // Mostrar la ventana
        frame.pack();
        frame.setVisible(true);
    }    
}
