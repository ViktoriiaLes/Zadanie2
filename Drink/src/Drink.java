public class Drink {
    String name;
    double price;
    boolean isAlcohol;
    Ingredient ingredient1;
    Ingredient ingredient2; 
    Ingredient ingredient3; 

    public double getTotalVolume() {
               return ingredient1.volume + ingredient2.volume + ingredient3.volume;
    }
}
