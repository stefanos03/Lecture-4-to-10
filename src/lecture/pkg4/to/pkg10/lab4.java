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
public class lab4 {
    
    public static void main(String[] args) {
        int month,numdays;
        String response,monthname;
        response =JOptionPane.showInputDialog(null, "Please enter the number of the month in range 1-12");
        month=Integer.parseInt(response);
        
        switch(month){
            case 1:
                monthname ="January";
                numdays=31;
                break;
            case 2:
                monthname ="February";
                response = JOptionPane.showInputDialog( "is this a leap year (y or n)?");
                char yesorno=response.charAt(0);
                if(yesorno=='y'){
                    numdays=29;
                } else{
                    numdays=28;
                };
                break;
            default:
                monthname="invalid";
                numdays=0;
                
        }
        JOptionPane.showMessageDialog(null,"Month   "+month+"is  "+ monthname+"WHICH HAS  "+ numdays+"   days");
    }
}
