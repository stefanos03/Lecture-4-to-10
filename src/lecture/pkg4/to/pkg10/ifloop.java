/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lecture.pkg4.to.pkg10;

import javax.swing.JOptionPane;

/**
 *
 * @author Dell
 */
public class ifloop {
    public static void main(String[] args) {
//        String givenum= JOptionPane.showInputDialog(null,"give the mark");
// int mark = Integer.parseInt(givenum);
//        if (mark >= 40) {
//System.out.println("Passed") ;
//System.out.println("Proceed to next stage");
//}
//else {
//System.out.println("Resit") ;
//}

String result;
int mark = Integer.parseInt(JOptionPane.showInputDialog("Give your mark"));
if (mark >= 70){
    result = "Grade A" ;
}

else if (mark >= 60){
        result = "Grade B" ;
        }

else if (mark >= 50){
        result = "Grade C" ;
        }

else if (mark >= 40){
        result = "Grade D" ;
        }

else if (mark >= 35){
        result = "Grade E" ;
        }

else {
        result = "Grade F" ;
        }
System.out.println(result);
    }
}
