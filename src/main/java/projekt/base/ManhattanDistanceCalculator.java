package projekt.base;

public class ManhattanDistanceCalculator implements DistanceCalculator{

    /**
     * Calculates the Manhattan difference between two different locations. Distance being regarded as
     * the time a vehicle takes to get from location one to two.
     *
     * @param location1 the first location
     * @param location2 the second location
     * @return the distance expressed in double, also regarded as the time a vehicle takes to get from location one to
     * two
     */
    @Override
    public double calculateDistance(Location location1, Location location2) {
        int diffX = Math.abs((location1.getX() - location2.getX()));
        int diffY = Math.abs((location1.getY() - location2.getY()));
        double distance = diffX + diffY;
        return distance;
    }
}
