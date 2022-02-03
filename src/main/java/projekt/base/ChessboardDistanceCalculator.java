package projekt.base;

public class ChessboardDistanceCalculator implements DistanceCalculator{

    /**
     * Calculates the distance between two different locations. Distance being regarded as
     * the time a vehicle takes to get from location one to two.
     * Distance now being the amount of steps a king must take to get to one location to the next. Thus based on the
     * principle that the vehicle also may also move diagonally as fast as in a straight line even though the diagonal
     * line is longer.
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
        double distance = Math.max(diffX, diffY);
        return distance;
    }
}
