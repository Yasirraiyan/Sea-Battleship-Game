public class Flee
{
    private List<Ship> ships;

    public Fleet() 
    {
        ships = new ArrayList<>();
    }

    public void addShip(Ship ship)
    {
        ships.add(ship);
    }

    public List<Ship> getShips() 
    {
        return ships;
    }
}
