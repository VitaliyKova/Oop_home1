import java.util.ArrayList;
import java.util.List;

public class AutomatHotDrinks implements Automat{
    ;
    List<HotDrink> list = new ArrayList<>();

    public AutomatHotDrinks() {
    }

    public void addDrink(HotDrink drink){
        list.add(drink);
    }


    @Override
    public void getProduct(HotDrink drink) {
        for (Object drinks:list) {
            if(drinks.equals(drink)){
                System.out.println(drinks.toString());
            }

        }

    }

}
