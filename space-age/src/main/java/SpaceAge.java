class SpaceAge {
    private final double seconds;
    private final double earthAge;

    SpaceAge(double seconds) {
        this.seconds = seconds;
        earthAge = onEarth();
    }

    double getSeconds() {
        return this.seconds;
    }

    double onEarth() {
        return getSeconds() / 31557600;
    }

    double onMercury() {
        return earthAge / 0.2408467;
    }

    double onVenus() {
        return earthAge / 0.61519726;
    }

    double onMars() {
        return earthAge / 1.8808158;
    }

    double onJupiter() {
        return earthAge / 11.862615;
    }

    double onSaturn() {
        return earthAge / 29.447498;
    }

    double onUranus() {
        return earthAge / 84.016846;
    }

    double onNeptune() {
        return earthAge / 164.79132;
    }

}
