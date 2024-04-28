package com.mycompany.inf_sis;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.event.ActionEvent;


class Panel2 extends JFrame {
     JLabel Labeltitulo2 = new JLabel("Dispositivo de entrada 'Microfono'");
     JButton button = new JButton("Grabar");
     JFrame frame = new JFrame("Botón Grabar/Detener");
     
     Panel2 (String titulo1){
        frame.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        frame.setSize(300, 200);

        
        // ActionListener para cambiar el texto del botón cuando se hace clic en él
        button.addActionListener(new ActionListener() {
            boolean grabando = false;

            @Override
            public void actionPerformed(ActionEvent e) {
                grabando = !grabando; // Cambiar el estado de grabando
                if (grabando) {
                    button.setText("Detener");
                    // Aquí puedes agregar lógica para comenzar a grabar
                } else {
                    button.setText("Grabar");
                    // Aquí puedes agregar lógica para detener la grabación
                }
            }
        });

        frame.getContentPane().add(button);
        frame.setVisible(true);
    }
}
     
