/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculator;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

/**
 *
 * @author Colin
 */
public class CalculatorGUI extends JFrame implements ActionListener {
    
    private JPanel panel_buttons;
    private JPanel panel_display;
    
    private JButton[] button_numbers; 
    
    private JLabel label_display;
    
    public void init(){
        getContentPane().setLayout(null);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setResizable(false);
        setSize(250, 350);
        setLocationRelativeTo(null);
        setVisible(true);
        
        /////////////////////////////////////////////
        // Buttons Panel
        // =========================================
        // Buttons: button_numbers[]
        /////////////////////////////////////////////
        panel_buttons = new JPanel();
        panel_buttons.setFocusable(true);
        panel_buttons.setBounds(35,100,170,170);
        panel_buttons.setBorder(BorderFactory.createBevelBorder(1));
        add(panel_buttons);
        initializeNumberButtons();
        
        /////////////////////////////////////////////
        // Display Panel
        // =========================================
        // Labels: label_display
        // Buttons: button_clear, button_clearAll
        /////////////////////////////////////////////
        panel_display = new JPanel();
        panel_display.setBounds(5,5,235,50);
        panel_display.setBorder(BorderFactory.createBevelBorder(1));
        add(panel_display);
        
        label_display = new JLabel("genoigeorig");
        label_display.setBounds(5,5,150,50);
        label_display.setBackground(Color.WHITE);
        panel_display.add(label_display);
        
        System.out.println("Calculator GUI initialized");
    }
    
    private void initializeNumberButtons(){
        final int margin = 5;
        
        int verticalPos = margin;        
        int horizontalPos = margin;
        int spacing = 55;
        
        button_numbers = new JButton[9];
        
        int i = 0;
        for (int row = 0; row < 3; row++){
            for (int col = 0; col < 3; col++){
                button_numbers[i] = new JButton("" + (i + 1));
                button_numbers[i].setBounds(horizontalPos,verticalPos,50,50);
                horizontalPos+=spacing;
                panel_buttons.add(button_numbers[i]);
                i++;
            }
            horizontalPos = margin;
            verticalPos+=spacing;
        }
    }
    
    
    
    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
