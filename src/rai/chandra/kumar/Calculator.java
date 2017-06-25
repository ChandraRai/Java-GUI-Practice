package rai.chandra.kumar;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Chandra on 6/21/2017.
 */
public class Calculator extends JFrame{
    private JPanel calculatorRootPanel;
    private JPanel topPart;
    private JPanel southPart;
    private JButton btnSeven;
    private JButton btnDiv;
    private JButton btnEight;
    private JButton btnNine;
    private JButton btnMultiply;
    private JButton btnSix;
    private JButton btnFive;
    private JButton btnFour;
    private JButton btnMinus;
    private JButton btnThree;
    private JButton btnTwo;
    private JButton btnOne;
    private JButton btnAdd;
    private JButton btnEqual;
    private JButton btnDecimal;
    private JButton btnZero;
    private JLabel lblDisplay;
    private JButton btnCancel;
    private JButton btnCorrection;
    private JLabel lblmessageDisplay;
    private JLabel lblDataStore;



    public Calculator() {

        btnSeven.addActionListener(new ActionListener() { // Anonymous inner class
            @Override
            public void actionPerformed(ActionEvent e) {
                if(lblDisplay.getText().equals("0")) {
                    lblDisplay.setText("7");
                } else {
                    lblDisplay.setText(lblDisplay.getText() + "7");
                }
            }
        });
        btnEight.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(lblDisplay.getText().equals("0")) {
                    lblDisplay.setText("8");
                } else {
                    lblDisplay.setText(lblDisplay.getText() + "8");
                }
            }
        });
        btnZero.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                if(lblDisplay.getText().equals("0")) {
                    lblDisplay.setText("0");
                } else {
                    lblDisplay.setText(lblDisplay.getText() + "0");
                }
            }
        });
        btnNine.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(lblDisplay.getText().equals("0")) {
                    lblDisplay.setText("9");
                } else {
                    lblDisplay.setText(lblDisplay.getText() + "9");
                }
            }
        });
        btnFour.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(lblDisplay.getText().equals("0")) {
                    lblDisplay.setText("4");
                } else {
                    lblDisplay.setText(lblDisplay.getText() + "4");
                }
            }
        });
        btnFive.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(lblDisplay.getText().equals("0")) {
                    lblDisplay.setText("5");
                } else {
                    lblDisplay.setText(lblDisplay.getText() + "5");
                }
            }
        });
        btnSix.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(lblDisplay.getText().equals("0")) {
                    lblDisplay.setText("6");
                } else {
                    lblDisplay.setText(lblDisplay.getText() + "6");
                }
            }
        });
        btnOne.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(lblDisplay.getText().equals("0")) {
                    lblDisplay.setText("1");
                } else {
                    lblDisplay.setText(lblDisplay.getText() + "1");
                }
            }
        });
        btnTwo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(lblDisplay.getText().equals("0")) {
                    lblDisplay.setText("2");
                } else {
                    lblDisplay.setText(lblDisplay.getText() + "2");
                }
            }
        });
        btnThree.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(lblDisplay.getText().equals("0")) {
                    lblDisplay.setText("3");
                } else {
                    lblDisplay.setText(lblDisplay.getText() + "3");
                }
            }
        });
        btnCorrection.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                lblDisplay.setText("0");
                lblDataStore.setText("");
                lblmessageDisplay.setText("");
            }
        });
        btnCancel.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(lblDisplay.getText().length() > 0 ) {
                    lblDisplay.setText(lblDisplay.getText().substring(0, lblDisplay.getText().length() - 1));
                    if(lblDisplay.getText().isEmpty()) {
                        lblDisplay.setText("0");
                    }
                }
            }
        });
        btnAdd.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                lblmessageDisplay.setText("Add");
                lblDataStore.setText(lblDisplay.getText());
                lblDisplay.setText("0");
            }
        });
        btnEqual.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                    double num1 = Double.parseDouble(lblDataStore.getText());
                    double num2 = Double.parseDouble(lblDisplay.getText());
                if(lblmessageDisplay.getText() == "Add") {
                    lblDisplay.setText(String.valueOf((double) num1 + (double) num2 ));
                }
                else if(lblmessageDisplay.getText() == "Min") {
                    lblDisplay.setText(String.valueOf((double) num1 - (double) num2 ));
                }
                else if(lblmessageDisplay.getText() == "Mul") {
                    lblDisplay.setText(String.valueOf((double) num1 * (double) num2 ));
                }
                else if(lblmessageDisplay.getText() == "Div") {
                    lblDisplay.setText(String.valueOf((double)num1 / (double)num2 ));
                }
            }
        });
        btnMinus.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                lblmessageDisplay.setText("Min");
                lblDataStore.setText(lblDisplay.getText());
                lblDisplay.setText("0");
            }
        });
        btnMultiply.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                lblmessageDisplay.setText("Mul");
                lblDataStore.setText(lblDisplay.getText());
                lblDisplay.setText("0");
            }
        });
        btnDiv.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                lblmessageDisplay.setText("Div");
                lblDataStore.setText(lblDisplay.getText());
                lblDisplay.setText("0");
            }
        });
        btnDecimal.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(!(lblDisplay.getText().contains("."))) {
                    String s = lblDisplay.getText() + ".";
                    lblDisplay.setText(s);
                }
            }
        });
    }

    public static void main (String[] args) {
        JFrame frame = new JFrame("Calculator");
        frame.setContentPane(new Calculator().calculatorRootPanel);
        frame.setIconImage(new ImageIcon("path/app.png").getImage());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
