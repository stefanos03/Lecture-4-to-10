/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lecture.pkg4.to.pkg10;

import java.text.DecimalFormat;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Dell
 */
public class q8 {
    public static void main(String[] args) {
        ArrayList<String> products = new ArrayList();
    ArrayList<Double> costs = new ArrayList();
    products.add("Pen"); 
    costs.add(1.25);
    products.add("Paper"); 
    costs.add(2.8);
    products.add("Diary"); 
    costs.add(3.5);
    products.add("4GB USB"); 
    costs.add(6.2);

    String response="";
    int code=0, num=0;
    double total=0.0;
    String menu = "Stockcode  Product    Unit Cost";
    DecimalFormat to2dp = new DecimalFormat("0.00");

    for(int i=0; i < products.size(); i++) {
      menu +=   "\n      " + i + "               " + products.get(i) + "         " + costs.get(i);
    }

    do{
       code = Integer.parseInt(JOptionPane.showInputDialog(menu 
               + "\n\n Enter a product code 0 to 3, or -1 to exit"));
       if( (code>=0) && (code < products.size()) ) {
         num = Integer.parseInt(JOptionPane.showInputDialog(
                 "Enter the number of " + products.get(code) + "s required"));
         total = costs.get(code)*num;
         JOptionPane.showMessageDialog(null, " Cost of " 
                 + num + " " + products.get(code) + "s is £" + to2dp.format(total) );
       }
    }while(code!=-1);
    }
}
