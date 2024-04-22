/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.tutorial7calculator;

import com.mycompany.CalculatorFunctions;
import javax.swing.*;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;
import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

/**
 *
 * @author Dell
 */
public class Tutorial7Calculator {

    JFrame myFrame;
    JTextField displayArea;
    double answerSoFar = 0;
    CalculatorFunctions functionsClass = new CalculatorFunctions();

    Tutorial7Calculator() {
        myFrame = new JFrame();

        displayArea = new JTextField();
//        displayArea.setBorder(BorderFactory.createLineBorder(Color.yellow));
        displayArea.setEditable(false);

        myFrame.setSize(300, 500);
        myFrame.setTitle("Calculator");
        myFrame.setLayout(new GridBagLayout());
        myFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);

        GridBagConstraints displayGrid = new GridBagConstraints();
        displayGrid.gridx = 0; //panel starts from first row
        displayGrid.gridy = 0; //panel starts from first column
        displayGrid.gridheight = 3; //no of rows to be occupied by the panel
        displayGrid.weightx = 1.0; //takes up all the available horizontal
        displayGrid.weighty = 0.4; //takes up 40 percent of the available height
        displayGrid.gridwidth = GridBagConstraints.REMAINDER;
        displayGrid.fill = GridBagConstraints.VERTICAL;
        displayGrid.fill = GridBagConstraints.HORIZONTAL;
        myFrame.add(displayArea, displayGrid);

        JButton buttonSeven = new JButton("7");
        buttonSeven.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                displayArea.setText(displayArea.getText() + "7"); //this helps to display the new value when i press 7

            }
        });
        GridBagConstraints c = new GridBagConstraints();
        c.gridx = 0;
        c.gridy = 4;
        c.gridheight = 1;
        c.weightx = 0.25;
        c.weighty = 0.25;
        c.fill = GridBagConstraints.VERTICAL;
        myFrame.add(buttonSeven, c);

        JButton buttonEight = new JButton("8");
        buttonEight.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                displayArea.setText(displayArea.getText() + "8");

            }
        });
        GridBagConstraints c2 = new GridBagConstraints();
        c2.gridx = 1;
        c2.gridy = 4;
        c2.gridheight = 1;
        c2.weightx = 0.25;
        c2.weighty = 0.25;
        c2.fill = GridBagConstraints.VERTICAL;
        myFrame.add(buttonEight, c2);

        JButton buttonNine = new JButton("9");
        buttonNine.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                displayArea.setText(displayArea.getText() + "9");

            }
        });

        GridBagConstraints c3 = new GridBagConstraints();
        c3.gridx = 2;
        c3.gridy = 4;
        c3.gridheight = 1;
        c3.weightx = 0.25;
        c3.weighty = 0.25;
        c3.fill = GridBagConstraints.VERTICAL;
        myFrame.add(buttonNine, c3);

        JButton buttonAst = new JButton("*");
        buttonAst.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                functionsClass.setOperator("*");
                functionsClass.setVar1(displayArea.getText());
                functionsClass.setVar2("1.0");
                answerSoFar += functionsClass.getResult();
                displayArea.setText("");
            }

        });

        GridBagConstraints c4 = new GridBagConstraints();
        c4.gridx = 3;
        c4.gridy = 4;
        c4.gridheight = 1;
        c4.weightx = 0.25;
        c4.weighty = 0.25;
        c4.ipady = 0;
        c4.ipadx = 0;
        c4.fill = GridBagConstraints.VERTICAL;
        myFrame.add(buttonAst, c4);

        JButton buttonFour = new JButton("4");
        buttonFour.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                displayArea.setText(displayArea.getText() + "4");

            }
        });
        GridBagConstraints c5 = new GridBagConstraints();
        c5.gridx = 0;
        c5.gridy = 5;
        c5.gridheight = 1;
        c5.weightx = 0.25;
        c5.weighty = 0.25;
        c5.fill = GridBagConstraints.VERTICAL;
        myFrame.add(buttonFour, c5);

        JButton buttonFive = new JButton("5");
        buttonFive.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                displayArea.setText(displayArea.getText() + "5");

            }
        });
        GridBagConstraints c6 = new GridBagConstraints();
        c6.gridx = 1;
        c6.gridy = 5;
        c6.gridheight = 1;
        c6.weightx = 0.25;
        c6.weighty = 0.25;
        c6.fill = GridBagConstraints.VERTICAL;
        myFrame.add(buttonFive, c6);

        JButton buttonSix = new JButton("6");
        buttonSix.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                displayArea.setText(displayArea.getText() + "6");

            }
        });
        GridBagConstraints c7 = new GridBagConstraints();
        c7.gridx = 2;
        c7.gridy = 5;
        c7.gridheight = 1;
        c7.weightx = 0.25;
        c7.weighty = 0.25;
        c7.ipady = 0;
        c7.ipadx = 0;
        c7.fill = GridBagConstraints.VERTICAL;
        myFrame.add(buttonSix, c7);

        JButton buttonMinus = new JButton("-");
        buttonMinus.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                functionsClass.setOperator("-");
                functionsClass.setVar1(displayArea.getText());
                functionsClass.setVar2("" + 0);
                answerSoFar += functionsClass.getResult();

                displayArea.setText("");
            }
        });
        GridBagConstraints c8 = new GridBagConstraints();
        c8.gridx = 3;
        c8.gridy = 5;
        c8.gridheight = 1;
        c8.weightx = 0.25;
        c8.weighty = 0.25;
        c8.fill = GridBagConstraints.VERTICAL;
        myFrame.add(buttonMinus, c8);

        JButton buttonOne = new JButton("1");
        buttonOne.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                displayArea.setText(displayArea.getText() + "1");

            }
        });
        GridBagConstraints c9 = new GridBagConstraints();
        c9.gridx = 0;
        c9.gridy = 6;
        c9.gridheight = 1;
        c9.weightx = 0.25;
        c9.weighty = 0.25;
        c9.fill = GridBagConstraints.VERTICAL;
        myFrame.add(buttonOne, c9);

        JButton buttonTwo = new JButton("2");
        buttonTwo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                displayArea.setText(displayArea.getText() + "2");

            }
        });
        GridBagConstraints c10 = new GridBagConstraints();
        c10.gridx = 1;
        c10.gridy = 6;
        c10.gridheight = 1;
        c10.weightx = 0.25;
        c10.weighty = 0.25;
        c10.fill = GridBagConstraints.VERTICAL;
        myFrame.add(buttonTwo, c10);

        JButton buttonThree = new JButton("3");
        buttonThree.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                displayArea.setText(displayArea.getText() + "3");

            }
        });
        GridBagConstraints c11 = new GridBagConstraints();
        c11.gridx = 2;
        c11.gridy = 6;
        c11.gridheight = 1;
        c11.weightx = 0.25;
        c11.weighty = 0.25;
        c11.fill = GridBagConstraints.VERTICAL;
        myFrame.add(buttonThree, c11);

        JButton buttonZero = new JButton("0");
        buttonZero.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                displayArea.setText(displayArea.getText() + "0");

            }
        });
        GridBagConstraints c13 = new GridBagConstraints();
        c13.gridx = 0;
        c13.gridy = 7;
        c13.gridheight = 1;
        c13.weightx = 0.25;
        c13.weighty = 0.25;
        c13.fill = GridBagConstraints.VERTICAL;
        c13.anchor = GridBagConstraints.LAST_LINE_START;
        myFrame.add(buttonZero, c13);

        JButton buttonDot = new JButton(".");
        buttonDot.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                displayArea.setText(displayArea.getText() + ".");
            }
        });
        GridBagConstraints c14 = new GridBagConstraints();
        c14.gridx = 1;
        c14.gridy = 7;
        c14.gridheight = 1;
        c14.weightx = 0.25;
        c14.weighty = 0.25;
        c14.fill = GridBagConstraints.VERTICAL;
        myFrame.add(buttonDot, c14);

        JButton buttonPlus = new JButton("+");
        buttonPlus.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                functionsClass.setOperator("+");
                functionsClass.setVar1(displayArea.getText());
                functionsClass.setVar2("" + 0);
                answerSoFar += functionsClass.getResult();
                displayArea.setText("");

            }

        });
        GridBagConstraints c12 = new GridBagConstraints();
        c12.gridx = 3;
        c12.gridy = 6;
        c12.gridheight = 1;
        c12.weightx = 0.25;
        c12.weighty = 0.25;
        c12.fill = GridBagConstraints.VERTICAL;
        myFrame.add(buttonPlus, c12);

        JButton buttonEquals = new JButton("=");
        buttonEquals.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                functionsClass.setVar1("" + answerSoFar);
                functionsClass.setVar2(displayArea.getText() + "");
                answerSoFar += functionsClass.getResult();
//                functionsClass.clear();
                DecimalFormat df = new DecimalFormat("############.#########"); //# refers to precision .## will give 2 precision but will remove if both of them are 0's
                displayArea.setText(df.format(functionsClass.getResult()));

//                functionsClass.setVar2("" + answerSoFar);
            }

        });
        GridBagConstraints c15 = new GridBagConstraints();
        c15.gridx = 2;
        c15.gridy = 7;
        c15.gridheight = 1;
        c15.weightx = 0.25;
        c15.weighty = 0.25;
        c15.fill = GridBagConstraints.VERTICAL;
        myFrame.add(buttonEquals, c15);

        JButton buttonAC = new JButton("AC");
        buttonAC.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                functionsClass.clear();
                answerSoFar = 0;
                displayArea.setText("");
            }
        });
        GridBagConstraints c16 = new GridBagConstraints();
        c16.gridx = 3;
        c16.gridy = 7;
        c16.gridheight = 1;
        c16.weightx = 0.25;
        c16.weighty = 0.25;
        c16.fill = GridBagConstraints.VERTICAL;
        myFrame.add(buttonAC, c16);

        myFrame.setVisible(true); //should this at the end(if i put it first it won't show up
    }

    //How to generate a random number

    int randomNumber = (int)(Math.random()*1000)+1;//value between 0 - 999 +1

    public static void main(String[] args) {
        Tutorial7Calculator calculator1 = new Tutorial7Calculator();
    }
}
