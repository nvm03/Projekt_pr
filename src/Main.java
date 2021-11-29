public class Main {
    public static void main(String[] args) {
        Car car = null;
        try {
            System.out.println(car.getModel());
        }
        catch (NullPointerException e){
            System.out.println("Nie mozna pobrac model auta");
            e.printStackTrace();
            System.out.println(e.toString());
        }
    }
}
