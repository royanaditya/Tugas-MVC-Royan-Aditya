/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package View.Dosen;


import Controller.ControllerDosen;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author adity
 */
public class InputData extends JFrame {
   ControllerDosen controller;
    
    JLabel header = new JLabel("Input Dosen");
    JLabel labelInputNama = new JLabel("Nama");
    JLabel labelInputNIDN = new JLabel("NIDN");
    JTextField inputNama = new JTextField();
    JTextField inputNIDN = new JTextField();
    JButton tombolTambah = new JButton("Tambah Dosen");
    JButton tombolKembali = new JButton("Kembali");

    public InputData() {
        setTitle("Input Dosen");
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(null);
        setSize(480, 240);

        add(header);
        add(labelInputNama);
        add(labelInputNIDN);
        add(inputNama);
        add(inputNIDN);
        add(tombolTambah);
        add(tombolKembali);

        header.setBounds(20, 8, 440, 24);
        labelInputNama.setBounds(20, 32, 440, 24);
        inputNama.setBounds(18, 56, 440, 36);
        labelInputNIDN.setBounds(20, 96, 440, 24);
        inputNIDN.setBounds(18, 120, 440, 36);
        tombolKembali.setBounds(20, 160, 215, 40);
        tombolTambah.setBounds(240, 160, 215, 40);
        
        controller = new ControllerDosen(this);

        /* 
          Memberikan event handling untuk tombol kembali,
          Ketika tombol kembali diklik, maka akan kembali ke halaman ViewData().
         */
        tombolKembali.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
                new View.Dosen.ViewData();
            }
        });

        tombolTambah.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                controller.insertDosen();
            }
        });
    }
    
    /*
      Membuat sebuah getter untuk mengambil nilai dari form "inputNama".
      Kenapa perlu getter? karena nama yang diinput user akan digunakan di controller.
      Kita tidak bisa langsung mengambil isi dari input nama karena variabel "inputNama"
      memiliki modifier "default", yang artinya variabel tersebut tidak dapat diakses
      di package yang berbeda. Sebagaimana sturktur folder kita, 
      file ControllerMahasiswa.java dan file PageInputMahasiswa.java 
      berada pada package yang berbeda.
    */
    public String getInputNama() {
        return inputNama.getText();
    }
    
    /*
      Membuat sebuah getter untuk mengambil nilai dari form "inputNIM".
      Kenapa perlu getter? karena NIM yang diinput user akan digunakan di controller.
      Kita tidak bisa langsung mengambil isi dari input NIM karena variabel "inputNIM"
      memiliki modifier "default", yang artinya variabel tersebut tidak dapat diakses
      di package yang berbeda. Sebagaimana sturktur folder kita, 
      file ControllerMahasiswa.java dan file PageInputMahasiswa.java 
      berada pada package yang berbeda.
    */
    public String getInputNIDN() {
        return inputNIDN.getText();
    } 
}
