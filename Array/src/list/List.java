/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package list;

import BASE.StructureStatic;

/**
 *
 * @author Windows
 */
public class List<T> extends StructureStatic<T>{

    public List() {
        super();
    }

    public List(int capacity) {
        super(capacity);
    }

    public boolean add(T element) {
        return super.add(element);
    }

    public boolean add(int position, T element) {
        return super.add(position, element);
    }

    public T search(int position) {

        if (!(position >= 0 && position <= super.size)) {
            throw new IllegalArgumentException("Invalid position!");
        }
        return super.elements[position];
    }

    public int search(T element) {

        for (int i = 0; i < super.size; i++) {
            if (super.elements[i].equals(element)) {
                return i;
            }
        }
        return -1;
    }

    public void remove(int position) {      
        super.remove(position);
    }

}
