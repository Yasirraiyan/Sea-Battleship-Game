public class Map 
{
    private String terrainType;

    public Map(String terrainType) 
    {
        this.terrainType = terrainType;
    }

    public String getTerrainType()
    {
        return terrainType;
    }

    public void displayMap()
    {
        System.out.println("Map terrain type: " + terrainType);
        
    }
}
