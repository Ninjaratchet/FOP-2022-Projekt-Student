package projekt.base;

@FunctionalInterface
public interface DistanceCalculator {

    /**
     * Calculates the distance between two different locations based on unique protocols. Distance being regarded as
     * the time a vehicle takes to get from location one to two.
     * @param location1 the first location
     * @param location2 the second location
     * @return the distance expressed in double, also regarded as the time a vehicle takes to get from location one to
     * two
     */
    double calculateDistance(Location location1, Location location2);
}
