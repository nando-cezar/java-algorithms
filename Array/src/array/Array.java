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
public class Array {

    private String[] elements;
    private int size;

    public Array(int param) {
        this.elements = new String[param];
        this.size = 0;
    }

    public void add(String element) {
        for (int i = 0; i < elements.length; i++) {
            if (this.elements[i] == null) {
                this.elements[i] = element;
                break;
            }
        }
    }

    public boolean add(int position, String element) {
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

    public String busca(int position) {
        return null;
    }

    public int search(String element) {
        return 0;
    }

    public int size() {
        return 0;
    }

    @Override
    public String toString() {
        return null;
    }

}
