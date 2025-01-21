package quizcaca;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class KlikSaya {
    public static void main(String[] args) {
        // Membuat frame
        JFrame frame = new JFrame("Aplikasi GUI Sederhana");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200);
        frame.setLayout(new FlowLayout());

        // Membuat label
        final JLabel label = new JLabel("Tekan tombol di bawah");
        frame.add(label);

        // Membuat tombol
        JButton button = new JButton("Klik Saya");
        frame.add(button);

        // Menambahkan ActionListener pada tombol
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                label.setText("Tombol telah diklik!");
            }
        });

        // Menampilkan frame
        frame.setVisible(true);
    }
}