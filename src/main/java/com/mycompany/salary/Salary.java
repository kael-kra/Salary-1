/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.salary;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;


/**
 *
 * @author princ
 */
public class Salary extends JFrame {
    JLabel name, age, hairColor, rate, hoursWorked, birthYear, salary;
    JTextField nameField, ageField, hairColorField, rateField, hoursWorkedField;
    JButton continueButton;
    
    public Salary() {
        name        = new JLabel("Name:");
        age         = new JLabel("Age:");
        hairColor   = new JLabel("Hair color:");
        rate        = new JLabel("Rate:");
        hoursWorked = new JLabel("Hours worked:");
        birthYear   = new JLabel("Birth year");
        salary      = new JLabel("Salary");
        
        
        nameField         = new JTextField();
        ageField          = new JTextField();
        hairColorField    = new JTextField();
        rateField         = new JTextField();
        hoursWorkedField  = new JTextField();
                
        continueButton = new JButton("Confirm");
        
        name.setBounds     (30, 40, 100, 20);
        nameField.setBounds(120, 35, 150, 30);
        
        age.setBounds     (30, 110, 100, 20);
        ageField.setBounds(120, 105, 150, 30);
        
        hairColor.setBounds     (30, 180, 100, 20);
        hairColorField.setBounds(120, 175, 150, 30);
        
        rate.setBounds     (30, 250, 100, 20);
        rateField.setBounds(120, 245, 150, 30);
        
        hoursWorked.setBounds     (30, 320, 100, 20);
        hoursWorkedField.setBounds(120, 315, 150, 30);
        
        birthYear.setBounds  (30, 390, 100, 20);
        
        salary.setBounds(30, 460, 100, 20);
        
        continueButton.setBounds(140, 500, 100, 20);
        
        add(name); add(nameField);  
        add(age); add(ageField);
        add(hairColor); add(hairColorField);
        add(rate); add(rateField);
        add(hoursWorked); add(hoursWorkedField);
        add(continueButton); 
        add(birthYear);
        add(salary);
        
        setTitle("Sir Harwin Pogi");
        
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
        
        setSize(600, 600);
        setLocationRelativeTo(null);
        setVisible(true);
        
        continueButton.addActionListener(e -> {
            int birthYearValue = 2025 - Integer.parseInt(ageField.getText());
            birthYear.setText("Birth year: " + birthYearValue);
            
            double salaryValue = Double.parseDouble(rateField.getText()) * Double.parseDouble(hoursWorkedField.getText());
            salary.setText("Salary: " + salaryValue);
            
        });
        
    }
    public static void main(String[] args) {
        new Salary();
    }
}
