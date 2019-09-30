public class Program {
    public static void main(String[] args) {
        double totalVolume;
        Drink drink1=new Drink();
        drink1.name="Bloody Mary";
        drink1.price=5.48;
        drink1.ingredient1.name="vodka";
        drink1.ingredient1.volume=100;
        drink1.ingredient2.name="tomato juice";
        drink1.ingredient2.volume=50;
        drink1.ingredient3.name="lemon juice";
        drink1.ingredient3.volume=500;

        System.out.printf("Drink \tname:\t%s\n\t\tprice:\t%10.2f\n",drink1.name,drink1.price );
        System.out.println("Ingredients:");
        System.out.println(drink1.ingredient1.name);
        System.out.println(drink1.ingredient2.name);
        System.out.println(drink1.ingredient3.name);
        System.out.println("Total volume: " + drink1.getTotalVolume() +"ml");
    }
}
