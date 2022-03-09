package AraguaiaTeste;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.sql.*;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class teste {
    
    interface exemplo{
        public String say(String txt);
    }
    
    
    
    public static void main(String[] args) {
        
         exemplo s =(txt)->{
             return txt;
        };
        
        System.out.println(s.say("meu nome e damerson"));
                
    }
    
    
    
    
    
}

//        static String OptionPaneExample() {
//            JFrame f;
//            f = new JFrame();
//            String name = JOptionPane.showInputDialog(f,"Enter Name");
//            return name;
//        }
/*
    static class ComboBoxExample {

        JFrame f;

        void ComboBoxExample() {
            f = new JFrame("ComboBox Example");
            final JLabel label = new JLabel();
            label.setHorizontalAlignment(JLabel.CENTER);
            label.setSize(400, 100);
            JButton b = new JButton("Show");
            b.setBounds(200, 100, 75, 20);
            String languages[] = {"C", "C++", "C#", "Java", "PHP"};
            final JComboBox cb = new JComboBox(languages);
            cb.setBounds(50, 100, 90, 20);
            f.add(cb);
            f.add(label);
            f.add(b);
            f.setLayout(null);
            f.setSize(350, 350);
            f.setVisible(true);
            b.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    String data = "Programming language Selected: "
                            + cb.getItemAt(cb.getSelectedIndex());
                    label.setText(data);
                }
            });
            
            */

//        public static void main(String[] args) {
//            ComboBoxExample c = new ComboBoxExample();
//            c.ComboBoxExample();
        
        
        
//        }
            
//        try {
//            FileWriter meuObjt = new FileWriter("filename.txt");
//            meuObjt.write("Arquivos e java pode ser complicado, suficiente divertido");
//            meuObjt.close();
//            
//            System.out.println("Criado com sucesso");
//        } catch (IOException e) {
//            System.out.println("ocorreu um erro ");
//            e.printStackTrace();
//            
//        }

//        Funcionario[] fun = new Funcionario[14];
//        
//        System.out.println(fun.length);
//                
//        ArrayList<Integer> numeros = new ArrayList<Integer>();
//        numeros.add(10); // 1
//        numeros.add(30); // 1
//        numeros.add(500); // 1
//        numeros.add(40); // 1
//        numeros.add(500); // 2
//        numeros.add(10); // 2
//        numeros.add(30); // 2
//        numeros.add(500); // 3
//        numeros.add(40); // 2
//        numeros.add(500); // 4
//        numeros.add(30); // 3
//        numeros.add(30); // 4
//        numeros.add(10); // 3
//        numeros.add(30); // 5
//        numeros.add(500); // 5
//        numeros.add(40); // 3
//
//        HashSet<Integer> numerosSemRepeticoes = new HashSet<Integer>(numeros);
//
//        Iterator<Integer> iteradorDeNumerosSemRepeticoes = numerosSemRepeticoes.iterator();
//
//        for (Integer i : numerosSemRepeticoes) {
//            System.out.println(i +" Repete: "+ Collections.frequency(numeros,
//                    iteradorDeNumerosSemRepeticoes.next()));
//        }
    
