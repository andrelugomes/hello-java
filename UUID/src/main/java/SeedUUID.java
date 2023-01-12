import java.nio.charset.StandardCharsets;
import java.util.UUID;

public class SeedUUID {

    public static void main(String[] args) {
        var randomUUID = UUID.randomUUID();

        System.out.println(randomUUID);


        var seed = "{\"my\":\"payload\"}";
        var seededUUID = UUID.nameUUIDFromBytes(seed.getBytes(StandardCharsets.UTF_8));
        System.out.println(seededUUID);
        var seededUUID2 = UUID.nameUUIDFromBytes(seed.getBytes(StandardCharsets.UTF_8));
        System.out.println(seededUUID2);
    }
}
