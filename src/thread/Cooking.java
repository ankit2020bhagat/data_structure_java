package thread;

public class Cooking extends Thread {

    private final String dish;

    public Cooking(String dish) {
        this.dish = dish;
    }

    public static void main(String[] args) {
        Cooking dish = new Cooking("Maggie");
        Cooking dish2 = new Cooking("Pasta");
        Cooking dish3 = new Cooking("Coffee");
        Cooking dish4 = new Cooking("Tea");

        dish.start();
        dish2.start();
        dish3.start();
        dish4.start();
    }

    public void run() {
        System.out.println(dish + "is prepared by " + Thread.currentThread().getName());
    }


}
