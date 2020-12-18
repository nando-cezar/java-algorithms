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
        System.out.println(a.search("element 1") + " - " + a.search("element 5"));
        System.out.println(a);
        a.add(0, "element 4");
        System.out.println(a);
        a.add(3, "element 5");
        System.out.println(a);
        a.add(4, "element 6");
        System.out.println(a);
        a.remove(3);
        System.out.println(a);
        
        ArrayObjects ao = new ArrayObjects(5);
        
        Contact c1 = new Contact("Fernando", "99999", "nandocezar@gmail.com");
        Contact c2 = new Contact("Lucas", "99999", "lucascezar@gmail.com");
        Contact c3 = new Contact("Iris", "99999", "iriscezar@gmail.com");
        
        ao.add(c1);
        ao.add(c2);
        ao.add(c3);
        
        System.out.println(ao.getSize());
        System.out.println(ao);
        System.out.println(ao.search(0));
        System.out.println(ao.search(c1) + " - " + ao.search(c3));
    }
    
}
