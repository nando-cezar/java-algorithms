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
public class List<T> {

    private T[] elements;
    private int size;

    public List(int param) {
        this.elements = (T[]) new Object[param];
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
    public boolean add(T element) {
        this.addCapacity();
        if (this.size < this.elements.length) {
            this.elements[this.size] = element;
            this.size++;
            return true;
        } else {
            return false;
        }

    }

    public boolean add(int position, T element) {

        if (!(position >= 0 && position <= this.size)) {
            throw new IllegalArgumentException("Invalid position!");
        }
        this.addCapacity();
        //move all elements
        for (int i = this.size - 1; i >= position; i--) {
            this.elements[i+1] = this.elements[i];
        }
        
        this.elements[position] = element;
        this.size++;
        
        return false;
    }
    
    private void addCapacity(){
        if(this.size == this.elements.length){
            T[] newElements = (T[]) new Object[this.elements.length * 2]; 
            for (int i = 0; i < this.elements.length; i++) {
                newElements[i] = this.elements[i];               
            }
            this.elements = newElements;
        }
    }

    public Object search(int position) {

        if (!(position >= 0 && position <= this.size)) {
            throw new IllegalArgumentException("Invalid position!");
        }
        return this.elements[position];
    }

    public int search(T element) {

        for (int i = 0; i < this.size; i++) {
            if (this.elements[i].equals(element)) {
                return i;
            }
        }
        return -1;
    }

    public int lastIndexOf(T element){
        
        int lastIndex = -1;

        for (int i = this.size; i > 0; i--) {
            if (this.elements[i].equals(element)) {
                lastIndex = i;
            }
        }

        return lastIndex;
    }

    public boolean contains(T element){
        return search(element) > -1;
    }

    public int getSize() {
        return this.size;
    }

    @Override
    public String toString() {

        StringBuilder sb = new StringBuilder();

        sb.append("[");

        for (int i = 0; i < this.size - 1; i++) {
            sb.append(this.elements[i]);
            sb.append(", ");
        }

        if (this.size > 0) {
            sb.append(this.elements[this.size - 1]);
        }

        sb.append("]");

        return sb.toString();
    }

    public void remove(int position) {
        if (!(position >= 0 && position <= this.size)) {
            throw new IllegalArgumentException("Invalid position!");
        }
        for (int i = position; i < this.size-1; i++) {
            this.elements[i] = this.elements[i+1];            
        }
        this.size--;
    }

    public void remove(T element) {
        
        int position = this.search(element);
        if(position > -1){
            this.remove(position);
        }
    }

}
