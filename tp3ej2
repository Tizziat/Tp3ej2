import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ConversorTemperatura extends JFrame {

    private JTextField txtTemperatura;
    private JButton btnConvertir;
    private JRadioButton rbFahrenheit, rbCelsius, rbKelvin;
    private ButtonGroup grupoOpciones;

    public ConversorTemperatura() {
        setTitle("Conversor de Temperatura");
        setSize(400, 250);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(6, 1));

        JLabel lblTitulo = new JLabel("Ingrese temperatura en Grados", JLabel.CENTER);
        panel.add(lblTitulo);

        txtTemperatura = new JTextField();
        panel.add(txtTemperatura);

        
        rbFahrenheit = new JRadioButton("A Fahrenheit");
        rbCelsius = new JRadioButton("A Celsius");
        rbKelvin = new JRadioButton("A Kelvin");

        grupoOpciones = new ButtonGroup();
        grupoOpciones.add(rbFahrenheit);
        grupoOpciones.add(rbCelsius);
        grupoOpciones.add(rbKelvin);

        panel.add(rbFahrenheit);
        panel.add(rbCelsius);
        panel.add(rbKelvin);