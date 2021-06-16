/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lecture.pkg4.to.pkg10;

import java.util.ArrayList;
import java.util.HashMap;
import javax.swing.JOptionPane;

/**
 *
 * @author Dell
 */
public class test {
    public static void main(String[] args) {
//        int a =10;
//        String b="hello";
//        HashMap<String,Integer> happy = new HashMap<String,Integer>();
//        happy.put("a",10);
//        happy.put("b",3);
//        happy.put("c", 88);
//        System.out.println(happy.get("c"));
//ArrayList fruitList = new ArrayList();
//fruitList.add("Mango");
//fruitList.add("Apple");
//fruitList.add("Strawberry");
//fruitList.add("WaterMelon");
//
//        System.out.println(fruitList);

int n = Integer.parseInt(JOptionPane.showInputDialog("Enter a grade")) ;

if(n>=90 && n <=100){
    System.out.println("A");
} else if( n >=80 && n<90 ){
    System.out.println("B");
}else if( n>=70 && n<80){
    System.out.println("C");
} else if (n >=60 && n<70){
        System.out.println("D");
    } else if(n>=0 && n<60){
        System.out.println("F");
    }else{
        System.out.println("the number is not in range");
    }

    }
}
