package behavioralpattern.templatemethodpattern.products;

import behavioralpattern.templatemethodpattern.skeleton.FoodMaker;

/**
 * @author Edmond Kacaj
 * @date 11/5/2019
 * @YEAR 2019
 * @Project Name DesignPattern
 */
public class PizzaMaker extends FoodMaker {
    @Override public void selectFlour() {
        System.out.println("---");
        System.out.println("We Choose the Italian Flour ");
        System.out.println("---");
    }

    @Override public void chooseIngredients() {
        System.out.println("---");
        System.out.println(
            "We need also Water,salt rosemary, pepper, and 2 tablespoons of the olive oil; toss to coat ");
        System.out.println("---");
    }

    @Override public void putTogether() {
        System.out.println("---");
        System.out.println("We mixed together ");
        System.out.println("---");
    }

    @Override public void bakeAtTemp() {
        System.out.println("---");
        System.out.println("We put in bake in Temp 230 Degrees C , for 20 min ");
        System.out.println("---");
    }

    @Override public void AddOtherTopics() {
        System.out.println("---");
        System.out
            .println("Sprinkle with cheese and remaining tablespoon olive oil. Cut into quarters ");
        System.out.println("---");
    }
}
