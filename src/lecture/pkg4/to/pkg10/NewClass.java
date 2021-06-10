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
public class NewClass {
    public static void main(String[] args) {
         String strChoice, strNumber, itemName;
        int itemPrice = 0, number;
        char choice;

        strChoice = JOptionPane.showInputDialog(
               "A  chocolate [75p]\n" +
               "B  toffee    [60p]\n" +
               "C  cookie    [90p]\n" +
               "Please enter your choice of product ");
        choice = strChoice.charAt(0);

        switch(choice){
          case 'A':
          case 'a':
            itemName = "chocolate";
            itemPrice = 75;
            break;

          case 'B':
          case 'b':
            itemName = "toffee";
            itemPrice = 60;
            break;

          case 'C':
          case 'c':
            itemName = "cookie";
            itemPrice = 90;
            break;

          default:
            itemName = "No choice made";
            itemPrice = 0;
        }

        if(itemPrice != 0 ){
          strNumber = JOptionPane.showInputDialog(
                       "How many " + itemName + " do you require ");
          number = Integer.parseInt(strNumber);
          JOptionPane.showMessageDialog(null,
                 "Your order is for " + number + " " +
                 itemName + " and will cost " +
                 number*itemPrice + "p");
        }
        else{
           JOptionPane.showMessageDialog(null,
                 "Item code not recognised");
        }
    } //end main
    }

