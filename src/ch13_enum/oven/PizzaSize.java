package ch13_enum.oven;

public enum PizzaSize {
    SMALL(8.99, 15),
    MEDIUM(12.99, 20),
    LARGE(16.99, 25),
    FAMILY(21.99, 35);

    private final double basePrice;
    private final int preparationTimeInMinutes;

    PizzaSize(double basePrice, int preparationTimeInMinutes) {
        this.basePrice = basePrice;
        this.preparationTimeInMinutes = preparationTimeInMinutes;
    }

    public double getBasePrice() {
        return basePrice;
    }

    public int getPreparationTimeInMinutes() {
        return preparationTimeInMinutes;
    }

    public double getPricePerSlice(int slices) {
        double pricePerSlice = basePrice / 6.0;
        return pricePerSlice * slices;
    }

    public boolean isGoodForParties() {
        return (this == LARGE || this == FAMILY);
    }
}
