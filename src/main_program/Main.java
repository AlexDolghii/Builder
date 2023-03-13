package main_program;

import dishes.builders.OrderBuilder;
import dishes.dessert.Cake;
import dishes.drinks.FruitFresh;
import dishes.first_dish.Bouillon;
import dishes.first_dish.Soup;
import dishes.second_dish.Macaroni;
import dishes.snacks.CheeseSticks;
import dishes.types.FirstDish;
import dishes.types.SecondDish;
import dishes.types.Snack;

public class Main {
    public static void main(String[] args) {

        Order order = new OrderBuilder()
                .addSnack(new CheeseSticks())
                .addDessert(new Cake())
                .build();

        Order order1 = new OrderBuilder()
                .addFirstDish(new Soup())
                .addSecondDish(new Macaroni())
                .addDrink(new FruitFresh())
                .build();

        OrderBuilder orderBuilder = new OrderBuilder();
        //something
        Snack snack = new CheeseSticks();
        //added snack
        orderBuilder.addSnack(snack);

        FirstDish firstDish = new Bouillon();

        orderBuilder.addFirstDish(firstDish);

        Order order2 = orderBuilder.build();

//        String str = "gsobnfe";
//        StringBuilder stringBuilder = new StringBuilder();
//        String newStr = stringBuilder.toString();

    }
}
