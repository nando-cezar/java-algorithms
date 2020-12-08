/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package array;

/**
 *
 * @author Windows
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        Array a = new Array(5);
        
        a.add("element 1");
        a.add("element 2");
        a.add("element 3");
      
        System.out.println(a.getSize());
        System.out.println(a.toString());
        System.out.println(a.search(0));
    }
    
}
