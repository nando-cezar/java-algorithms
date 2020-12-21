/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package array;

import java.util.ArrayList;

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

        List<String> l = new List<String>(5);
        l.add("list-element 1");
        l.add("list-element 2");
        l.add("list-element 3");

        System.out.println(l.getSize());
        System.out.println(l);
        System.out.println(l.search(0));
        System.out.println(l.search("list-element 1") + " - " + l.search("list-element 4"));

        ArrayList<String> arrayList = new ArrayList<String>();

        arrayList.add("element 1");
        arrayList.add("element 2");
        arrayList.add("element 3");

        arrayList.add(1, "element 4");

        if(arrayList.contains("element 4")){
            System.out.println("Element exists!");
        } else {
            System.out.println("Element not exists!");
        }

        int i = arrayList.indexOf("element 4");

        if(i > -1){
            System.out.println("Index element is " + i);
        } else {
            System.out.println("Element not exists in array!");
        }

    }
    
}
