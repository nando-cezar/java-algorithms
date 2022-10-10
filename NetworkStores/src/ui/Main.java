package ui;

import business.Client;
import business.Store;

public class Main {
    
    public static void main(String[] args){
        Store store = new Store("Lojas Americanas");

        store.getClients().add(
            new Client("Carlos", 1000, 20, 60, 200)
        );

        System.out.println(store.getClients());
    }
}
