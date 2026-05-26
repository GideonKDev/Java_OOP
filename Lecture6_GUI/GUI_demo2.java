package Java_OOP.Lecture6_GUI;

import javax.swing.JFrame;

public class GUI_demo2{
    public GUI_demo2(){
        JFrame myJframe = new JFrame("Java GUI Demo");
        myJframe.setVisible(true);
        myJframe.setSize(500,400);
        myJframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
    public static void main(String[] args){
        new GUI_demo2();
    }
}
