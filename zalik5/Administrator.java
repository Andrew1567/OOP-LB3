package zalik5;

import java.util.ArrayList;

public class Administrator {
    ArrayList<Client> blacklist = new ArrayList<>();

    public void addToBlacklist(Client client) {
        client.isBlacklisted = true;
        blacklist.add(client);
    }
}
