package calculator;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class BasicCalculator extends JFrame  {
    JTextField t1,t2,t3;
    JLabel l1,l2,l3;
    JButton b1,b2,b3,b4;
    public BasicCalculator()
    {
        super("MyCalculator");
        t1 = new JTextField(12);
        t2 = new JTextField(12);
        t3 = new JTextField(12);

        l1 = new JLabel(" First Number: ");
        l2 = new JLabel(" Second Number: ");
        l3 = new JLabel(" Result: ");

        b1 = new JButton(" Addition ");
        b2 = new JButton(" Subtraction ");
        b3 = new JButton(" Multiplication ");
        b4 = new JButton(" Division ");

        add(l1);
        add(t1);
        add(l2);
        add(t2);
        add(b1);
        add(b2);
        add(b3);
        add(b4);
        add(l3);
        add(t3);

        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double num1 =Double.parseDouble(t1.getText());
                double num2 =Double.parseDouble(t2.getText());
                double res = num1+num2;
                t3.setText(res+" ");
            }
        });

        b2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double num1 =Double.parseDouble(t1.getText());
                double num2 =Double.parseDouble(t2.getText());
                double res = num1-num2;
                t3.setText(res+" ");
            }
        });
        b3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double num1 =Double.parseDouble(t1.getText());
                double num2 =Double.parseDouble(t2.getText());
                double res = num1*num2;
                t3.setText(res+" ");
            }
        });
        b4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double num1 =Double.parseDouble(t1.getText());
                double num2 =Double.parseDouble(t2.getText());
                double res = num1/num2;
                t3.setText(res+" ");
            }
        });

        setLayout(new FlowLayout());
        setVisible(true);
        setSize(300, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

}
public class Main {
    public static void main(String[] args) {
        BasicCalculator bc = new BasicCalculator();
    }
}
