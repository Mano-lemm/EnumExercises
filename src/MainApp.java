public class MainApp {
    public static void main(String[] args) throws Exception {
        System.out.println("Cars are available in the following colours:");
        for (Colour colour : Colour.values()) {
            System.out.println("\t Colour nr: " + colour.ordinal()+ " is " + colour.toString().toLowerCase() );
        }

        System.out.println("Cars are available in the following models:");
        for (Model model : Model.values()) {
            System.out.println("\t Model nr: " + model.ordinal()+ " is " + model.toString().toLowerCase() );
        }

        System.out.println("Cars are available in the following price ranges:");
        for (PriceRange price : PriceRange.values()) {
            System.out.println("\t Price range nr: " + price.ordinal()+ " is " + price.toString().toLowerCase() );
        }

        Car car = new Car();
        System.out.printf("price of the chosen car in the price range %s is %d euro.\n", car.price.toString().toLowerCase(), car.getPrice());
    }
}
