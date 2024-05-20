/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Main;

/**
 *
 * @author adity
 */

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;


public class Menu extends JFrame implements ActionListener {
    JLabel welcome = new JLabel("Data Dosen dan Mahasiswa IF");
    JLabel deskripsi = new JLabel("Pilih Menu Terlebih Dahulu");
    JButton dosen = new JButton("Dosen");
    JButton mahasiswa = new JButton("Mahasiswa");

    public Menu() {
        // Konfigurasi frame
         setVisible(true);
        setLayout(null);
        setSize(560, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setTitle("Menu");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Tambahkan komponen ke frame
        add(welcome);
        welcome.setBounds(40, 20, 300, 35);
        welcome.setFont(new Font("Arial", Font.PLAIN, 20));

        add(deskripsi);
        deskripsi.setBounds(40, 55, 300, 35);
        deskripsi.setFont(new Font("Arial", Font.ITALIC, 15));

        add(dosen);
        dosen.setBounds(40, 100, 200, 30);
        dosen.setFont(new Font("Arial", Font.ITALIC, 15));
        dosen.addActionListener(this);

        add(mahasiswa);
        mahasiswa.setBounds(40, 140, 200, 30);
        mahasiswa.setFont(new Font("Arial", Font.ITALIC, 15));
        mahasiswa.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == dosen) {
            new View.Dosen.ViewData();
            this.dispose();
        } else if (e.getSource() == mahasiswa) {
            new View.Mahasiswa.ViewData();
            this.dispose();
        }
    }
}


   
