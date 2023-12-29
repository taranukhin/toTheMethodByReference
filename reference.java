package toTheMethodByReference;

public class reference {
    public static void main(String[] args) {
        Cat pixel = new Cat("Рыжий");
        changeColor(pixel);
        System.out.println(pixel.color + " очень идет коту");

    }
    private static void changeColor(Cat someCat){
        someCat.color = "Черный";
    }

}

class Cat {
    String color;
    public Cat(String catColor){
        color = catColor;
    }
}
