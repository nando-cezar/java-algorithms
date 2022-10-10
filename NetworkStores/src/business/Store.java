package business;

import java.util.ArrayList;
import java.util.List;

public class Store {
    
    private String name;
    private List<Client> clients;

    public Store(String name) {
        this.name = name;
        this.clients = new ArrayList<Client>();
    }

    public String getName() {
        return name;
    }

    public List<Client> getClients() {
        return clients;
    }
}
