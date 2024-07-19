import java.security.PrivateKey;

public class Map {
    private String nameTerrain;
    private String nameOperations;

    public String getNameTerrain() {
        return nameTerrain;
    }

    public void setNameTerrain(String nameTerrain) {
        this.nameTerrain = nameTerrain;
    }

    public String getNameOperations() {
        return nameOperations;
    }

    public void setNameOperations(String nameOperations) {
        this.nameOperations = nameOperations;
    }

    public Map(String nameTerrain, String nameOperations) {
        this.nameTerrain = nameTerrain;
        this.nameOperations = nameOperations;
    }
}
