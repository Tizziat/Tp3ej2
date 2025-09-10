import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class tp3ej2 extends JFrame {

    private JTextField txtTemperatura;
    private JButton btnConvertir;
    private JRadioButton rbFahrenheit, rbCelsius, rbKelvin;
    private ButtonGroup grupoOpciones;

    public tp3ej2() {
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

        btnConvertir = new JButton("Convertir");
        panel.add(btnConvertir);

        add(panel);

        // Acción del botón
        btnConvertir.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    double celsius = Double.parseDouble(txtTemperatura.getText());
                    double resultado = 0;
                    String unidad = "";

                    if (rbFahrenheit.isSelected()) {
                        resultado = (celsius * 9 / 5) + 32;
                        unidad = "°F";
                    } else if (rbKelvin.isSelected()) {
                        resultado = celsius + 273.15;
                        unidad = "K";
                    } else if (rbCelsius.isSelected()) {
                        resultado = celsius; // no cambia
                        unidad = "°C";
                    } else {
                        JOptionPane.showMessageDialog(null, "Seleccione una opción.");
                        return;
                    }

                    JOptionPane.showMessageDialog(null,
                            "La temperatura convertida es: " + resultado + " " + unidad,
                            "Resultado", JOptionPane.INFORMATION_MESSAGE);

                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(null, "Ingrese un valor numérico válido.");
                }
            }
        });
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new tp3ej2().setVisible(true);
        });
    }
}
