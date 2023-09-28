public class Main {
    public static void main(String[] args) {
        Drink coffe = new HotDrink("Coffe",3,60);
        Drink tea = new HotDrink("Tea", 3,80);

        AutomatHotDrinks auto1 = new AutomatHotDrinks();

        auto1.addDrink((HotDrink) coffe);
        auto1.addDrink((HotDrink) tea);

        auto1.getProduct((HotDrink) coffe);
        auto1.getProduct((HotDrink) tea);







    }

}
