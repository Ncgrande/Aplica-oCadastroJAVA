package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class AppCadastro {

    public static void main(String[] args) {
        JFrame frame = new JFrame("Meu cadastro usuario");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);
        frame.setLayout(new GridLayout(6, 2));

        JLabel labelNome = new JLabel("Nome:");
        JTextField campoNome = new JTextField();

        JLabel labelSexo = new JLabel("Sexo");
        JRadioButton radioMasc = new JRadioButton("Masculino");
        JRadioButton radioFem = new JRadioButton("Feminino");
        ButtonGroup grupoSexo = new ButtonGroup();
        grupoSexo.add(radioMasc);
        grupoSexo.add(radioFem);

        JLabel labelIdioma = new JLabel("Idioma:");
        String[] idioma = {"Português", "Ingles", "Espanhol"};
        JComboBox<String> comboIdioma = new JComboBox<>(idioma);

        JButton botaoCadastrar = new JButton("Cadastrar");

        JTextArea areaDados = new JTextArea(5, 20);
        areaDados.setEditable(false);
        JScrollPane scroll = new JScrollPane(areaDados);

        frame.add(labelNome);
        frame.add(campoNome);
        frame.add(labelSexo);
        frame.add(radioMasc);
        frame.add(new JLabel());
        frame.add(radioFem);
        frame.add(labelIdioma);
        frame.add(comboIdioma);
        frame.add(botaoCadastrar);
        frame.add(scroll);

        botaoCadastrar.addActionListener((ActionEvent e) -> {
            String nome = campoNome.getText();
            String sexo = radioMasc.isSelected() ? "Masculino" : "Feminino";
            String idiomaSelecionado = (String) comboIdioma.getSelectedItem();

            areaDados.setText("Nome: " + nome + "\n");
            areaDados.append("Sexo: " + sexo + "\n");
            areaDados.append("Idioma: " + idiomaSelecionado + "\n");
        });

        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);

    }
}
