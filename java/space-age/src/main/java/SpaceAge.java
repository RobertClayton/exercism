class SpaceAge {

    private double timeInSeconds;

    SpaceAge(double seconds) {
        timeInSeconds = seconds;
    }

    double getSeconds(double orbitalPeriodInEarthYears) {
        double earthYearlySeconds = 31557600;
        return timeInSeconds / (earthYearlySeconds * orbitalPeriodInEarthYears);
    }

    double onEarth() {
        return getSeconds(1);
    }

    double onMercury() {
        return getSeconds(0.2408467);
    }

    double onVenus() {
        return getSeconds(0.61519726);
    }

    double onMars() {
        return getSeconds(1.8808158);
    }

    double onJupiter() {
        return getSeconds(11.862615);
    }

    double onSaturn() {
        return getSeconds(29.447498);
    }

    double onUranus() {
        return getSeconds(84.016846);
    }

    double onNeptune() {
        return getSeconds(164.79132);
    }

}
