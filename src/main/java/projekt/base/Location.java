package projekt.base;

public class Location {
    private int x;
    private int y;

    /**
     * Constructs a Location by assigning the x and y coordinates.
     * @param x x coordinate of the location
     * @param y y coordinate of the location
     */
    public Location(int x, int y) {
        this.x = x;
        this.y = y;
    }

    /**
     * The x coordinate of the given location.
     * @return x coordinate of the given location
     */
    public int getX() {
        return x;
    }
    /**
     * The y coordinate of the given location.
     * @return y coordinate of the given location
     */
    public int getY() {
        return y;
    }

    /**
     * Produces a new Location comprised of the x and y coordinate
     * of the parameter Location and the class Location, by adding
     * their x and y coordinates.
     * @param location second Location to determine new Location
     * @return new Location with coordinates x/y =this.x/this.y + location.x/location.y
     */
    public Location add(Location location){
        return new Location(x+location.getX(),y+ location.getY());
    }
    /**
     * Produces a new Location comprised of the x and y coordinate
     * of the parameter Location and the class Location, by subtracting
     * their x and y coordinates.
     * @param location second Location to determine new Location
     * @return new Location with coordinates x/y =this.x/this.y - location.x/location.y
     */
    public Location subtract(Location location){
        return new Location(x-location.getX(),y- location.getY());
    }
}
