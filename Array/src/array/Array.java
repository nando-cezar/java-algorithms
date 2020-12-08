/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package array;

import java.util.Arrays;

/**
 *
 * @author Windows
 */
public class Array {

    private final String[] elements;
    private int size;

    public Array(int param) {
        this.elements = new String[param];
        this.size = 0;
    }

    /*public void add(String element) {
        for (int i = 0; i < elements.length; i++) {
            if (this.elements[i] == null) {
                this.elements[i] = element;
                break;
            }
        }
    }*/

    public boolean add(String element) {
        if (this.size < this.elements.length) {
            this.elements[this.size] = element;
            this.size++;
            return true;
        }else{
            return false;
        }

    }

    public void remove(int position) {

    }

    public String search(int position) {
        
        if(!(position >= 0 && position <= this.size)){
            throw new IllegalArgumentException("Invalid position!");
        }
        return this.elements[position];
    }

    public int getSize() {
        return this.size;
    }

    @Override
    public String toString() {
        
        StringBuilder sb = new StringBuilder();
        
        sb.append("[");
        
        for(int i = 0; i < this.size-1; i ++){
            sb.append(this.elements[i]);
            sb.append(", ");
        }
        
        if(this.size > 0){
          sb.append(this.elements[this.size-1]);
        }
        
        sb.append("]");
        
        return sb.toString();
    }

}
