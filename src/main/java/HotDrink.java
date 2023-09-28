public class HotDrink extends Drink{
    public int temp;

    public HotDrink(String nameDrink, int val, int temp) {
        super(nameDrink, val);
        this.temp = temp;
    }

    public int getTemp() {
        return temp;
    }

    public void setTemp(int temp) {
        this.temp = temp;
    }

    @Override
    public String toString() {
        return String.format("Ваш напиток -> " + nameDrink +"\nОбъем -> " + val + "\nТемпература -> " + temp + "\n");
    }
}
