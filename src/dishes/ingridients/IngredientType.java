package dishes.ingridients;

public enum IngredientType {
    BEAN(1, "bean"),
    BEEF_CHOP(2, "Beef chop"),
    CHICKEN_CHOP(3, "Chicken chop"),
    BEEF(4, "Beef"),
    CHICKEN(5, "Chicken"),
    CUCUMBER(6, "Cucumber"),
    KETCHUP(7, "Ketchup"),
    POTATO(8, "Potato"),
    SALAD(9, "Salad"),
    TOMATO(10, "Tomato"),
    OLIVES(11, "Olives"),
    CHEESE(12, "Cheese");

    private final String ruName;
    private final int id;


    IngredientType(int id, String name) {
        this.id = id;
        ruName = name;
    }
}
