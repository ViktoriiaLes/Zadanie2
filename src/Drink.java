public class Drink {
    String name;
    double price;
    boolean isAlcohol;

    Ingredient ingredient1 = new Ingredient();
    Ingredient ingredient2 = new Ingredient();
    Ingredient ingredient3 = new Ingredient();

    public double getTotalVolume() {
               return ingredient1.volume + ingredient2.volume + ingredient3.volume;
    }
}
