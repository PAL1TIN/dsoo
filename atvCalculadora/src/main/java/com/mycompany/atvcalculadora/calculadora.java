/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.atvcalculadora;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author 202312030003
 */
public class calculadora extends JFrame implements ActionListener {

    private JButton adicao, subtracao, multiplicacao, divisao;
    private JTextField num1, num2, resultado;
    private JLabel label1, label2, label3, titulo;
    private JPanel painelSuperior, painelCentral, painelInferior;
    
    public calculadora(){
        super("Calculadora");
        inicializarComponentes();
    }
    
    private void inicializarComponentes(){
        painelSuperior = new JPanel();
        painelCentral = new JPanel();
        painelInferior = new JPanel();
        
        add(painelSuperior, BorderLayout.NORTH);
        add(painelCentral, BorderLayout.SOUTH);
        add(painelCentral);
        
        titulo = new JLabel("CALCULADORA SIMPLES");
        
        painelSuperior.add(titulo);
        
        label1 = new JLabel("Numero 1: ");
        label2 = new JLabel("Numero 2: ");
        label3 = new JLabel("Resultado: ");
        num1 = new JTextField(20);
        num2 = new JTextField(20);
        resultado = new JTextField(20);
        
        adicao = new JButton("+");
        subtracao = new JButton("-");
        multiplicacao = new JButton("x");
        divisao = new JButton("/");
        
        painelCentral.setLayout(null);
        label1.setBounds(200,80,90,50);
        label2.setBounds(200,120,90,50);
        num1.setBounds(270,90,120,30);
        num2.setBounds(270,130,120,30);
        adicao.setBounds(190, 220, 50, 30);
        subtracao.setBounds(250, 220, 50, 30);
        multiplicacao.setBounds(310, 220, 50, 30);
        divisao.setBounds (370, 220, 50, 30);
        label3.setBounds(200, 300, 90, 50);
        resultado.setBounds(280, 310, 120, 30);
        
        
        
        painelCentral.add(label1);
        painelCentral.add(label2);
        painelCentral.add(num1);
        painelCentral.add(num2);
        painelCentral.add(adicao);
        painelCentral.add(subtracao);
        painelCentral.add(multiplicacao);
        painelCentral.add(divisao);
        painelCentral.add(label3);
        painelCentral.add(resultado);
        
    }


    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
