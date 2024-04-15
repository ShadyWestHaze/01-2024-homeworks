package src.main.java.io.codelex.oop.parcels;

class Parcel implements Validatable {
    private final int xLength;
    private final int yLength;
    private final int zLength;
    private final float weight;
    private final boolean isExpress;

    public Parcel(int xLength, int yLength, int zLength, float weight, boolean isExpress) {
        this.xLength = xLength;
        this.yLength = yLength;
        this.zLength = zLength;
        this.weight = weight;
        this.isExpress = isExpress;
    }

    @Override
    public boolean validate() {
        boolean isValid = true;
        StringBuilder errorMessage = new StringBuilder();

        if (xLength < 30 || yLength < 30 || zLength < 30) {
            errorMessage.append("Error: Each dimension should be at least 30.");
            isValid = false;
        }

        int sumOfDimensions = xLength + yLength + zLength;
        if (sumOfDimensions > 300) {
            errorMessage.append("Error: Sum of dimensions exceeds 300.");
            isValid = false;
        }

        float maxWeight = isExpress ? 15.0f : 30.0f;
        if (weight > maxWeight) {
            errorMessage.append("Error: Weight exceeds maximum allowed for express delivery.");
            isValid = false;
        }

        if (!isValid) {
            System.out.println(errorMessage);
        }

        return isValid;
    }
}