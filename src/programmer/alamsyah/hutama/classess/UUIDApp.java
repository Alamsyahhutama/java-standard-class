package programmer.alamsyah.hutama.classess;

import java.util.UUID;

public class UUIDApp {
    public static void main(String[] args) {
        for(var i = 0; i <= 1000; i++){
            UUID uuid =UUID.randomUUID();
            String key = uuid.toString();
            System.out.println(uuid);
        }
    }
}
