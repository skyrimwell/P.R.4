package ru.mirea.ikbo2019.pr4;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class GUI
{
    private int clickv1 = 0;
    private int clickv2 = 0;
    private JFrame mainframe = new JFrame();
    private JPanel FP = new JPanel();
    private JPanel SP = new JPanel();
    private JPanel TP = new JPanel();
    private JLabel text1 = new JLabel();
    private JLabel text2 = new JLabel();
    private JLabel text3 = new JLabel();

    private void func1() {
        if (clickv1 > clickv2)
            text3.setText("Результат: Победитель Реал Мадрид");
        else if (clickv1 < clickv2)
            text3.setText("Результат: Победитель Милан");
        else
            text3.setText("Результат: Ничья");
    }

    public GUI() {



        text1.setText("Счет Реал Мадрид: " + clickv1 + " Милан: " + clickv2 + "\n");
        text2.setText("Ласт гол: Никто");
        text3.setText("Результат: Ничья");

        JButton a = new JButton(new AbstractAction()
        {
            @Override
            public void actionPerformed(ActionEvent e) {
                clickv1++;
                text1.setText("Счет Реал Мадрид: " + clickv1 + " Милан: " + clickv2 + "\n");
                text2.setText("Ласт гол: Мадрид");
                func1();
            }
        });

        JButton b = new JButton(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                clickv2++;
                text1.setText("Счет Реал Мадрид: " + clickv1 + "Милан: " + clickv2  + "\n");
                text2.setText(" Ласт гол: Милан");
                func1();
            }
        });

        b.setText("Милан");
        a.setText("Реал Мадрид");

        FP.setBorder(BorderFactory.createEmptyBorder(10, 20, 10, 20));
        FP.setLayout(new GridLayout());

        SP.setBorder(BorderFactory.createEmptyBorder(10, 20, 10, 20));
        SP.setLayout(new GridLayout());

        TP.setBorder(BorderFactory.createEmptyBorder(10, 20, 10, 20));
        TP.setLayout(new GridLayout());

        FP.add(a);
        TP.add(b);

        SP.add(text1);
        SP.add(text2);
        SP.add(text3);
        mainframe.setTitle("Волк говно не скажет - волк говно покажет");
        mainframe.add(FP,BorderLayout.WEST);
        mainframe.add(SP,BorderLayout.CENTER);
        mainframe.add(TP,BorderLayout.EAST);
        mainframe.pack();
        mainframe.setVisible(true);
        mainframe.setResizable(false);

    }

}
