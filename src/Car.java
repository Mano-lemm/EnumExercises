public class Car {
    public Colour colour;
    public Model model;
    public PriceRange price;
    
    public Car(Colour colour, Model model, PriceRange price){
        this.colour = colour;
        this.model = model;
        this.price = price;
    }

    public Car(){
        this(Colour.STANDARD_COLOUR, Model.STANDAR_MODEL, PriceRange.STANDAR_PRICE);
    }

    public int getPrice(){
        switch (price) {
            case CHEAP:
                return 15000;
            case EXPENSIVE:
                return 50000;
            case MEDIUM:
                return 200000;
        }
        return -1;
    }
}
