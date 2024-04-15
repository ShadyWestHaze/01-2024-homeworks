package src.main.java.io.codelex.oop.runners;

public enum Runner {
    BEGINNER(360, Integer.MAX_VALUE),
    INTERMEDIATE(241, 359),
    ADVANCED(0, 240);

    private final int minTime;
    private final int maxTime;

    Runner(int minTime, int maxTime) {
        this.minTime = minTime;
        this.maxTime = maxTime;
    }

    public static Runner getFitnessLevel(int marathonTime) {
        for (Runner runner : Runner.values()) {
            if (marathonTime >= runner.minTime && marathonTime <= runner.maxTime) {
                return runner;
            }
        }
        throw new IllegalArgumentException("No fitness level found for marathon time: " + marathonTime);
    }
}
