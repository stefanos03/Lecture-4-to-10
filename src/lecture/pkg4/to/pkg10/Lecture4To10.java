
package lecture.pkg4.to.pkg10;

import javax.swing.JOptionPane;

/**
 *
 * @author Dell
 */
public class Lecture4To10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
   String respone, dayName;
   respone =JOptionPane.showInputDialog(null, "please enter an number from 1 to 7");
   int day = Integer.parseInt(respone);
   
   switch(day){
       case 1:
           dayName="Monday";
           break;
       case 2:
           dayName="Tuestday";
           break;
       case 3:
           dayName="Wednesday";
           break;
       case 4:
           dayName ="Thursday";
           break;
       case 5:
           dayName="Friday";
           
           break;
       case 6:
           dayName="Saturday";
           break;
       case 7:
           dayName ="Sunday";
       break;
       default:
           dayName ="Invalid";
   }
   JOptionPane.showMessageDialog(null, "Day "+day+"is "+ dayName);
    }
    
}
