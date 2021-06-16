/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lecture.pkg4.to.pkg10;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Dell
 */
public class Lab8 {
    public static void main(String[] args) {
         /*Here we create two new empty ArrayLists for storing 
        the names and contact numbers */ 
        ArrayList<String> names = new ArrayList();
        ArrayList<String> numbers = new ArrayList();
        String response = "";
        int num;
        
        /* A loop allowing user to enter as many names/numbers as required */ 
        while (JOptionPane.showConfirmDialog(null, "Add a contact?") == 0) {
            /* enter name and then add to the names ArrayList */
            response = JOptionPane.showInputDialog("Enter contact name");
            names.add(response);
            /* enter number and then add to the numbers ArrayList */
            response = JOptionPane.showInputDialog("Enter contact number");
            numbers.add(response);
        }
        
        /* Start an empty String, then use a loop 
         * to add each line to the String. Each line 
        * has a contact name and number. */
        String output = "";
        for (int i = 0; i < names.size(); i++) {
            output += i + " " + names.get(i) + " " + numbers.get(i) + "\n";
        }
        /* Once loop has finished, print out the resulting contact list. */
        JOptionPane.showMessageDialog(null, output);
        
        int index = 0;
        while(index != -1){
            index = Integer.parseInt(
                    JOptionPane.showInputDialog("Enter an index, or -1 to quit"));
            if(index >0 && index < names.size()){
                String newNumber = JOptionPane.showInputDialog("Enter new number for " + names.get(index));
                numbers.set(index, newNumber);
                output = "";
                for (int i = 0; i < names.size(); i++){
                    output += i + " " + names.get(i) + " " + numbers.get(i) + "\n";
                }
                JOptionPane.showMessageDialog(null, output);
            }        
            else if(index != -1){   
                JOptionPane.showMessageDialog(null, "Sorry index out of range");
            }
        }
    }
 
}
