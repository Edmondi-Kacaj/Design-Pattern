package behavioralpattern.templatemethodpattern.skeleton;

/**
 * @author Edmond Kacaj
 * @date 11/5/2019
 * @YEAR 2019
 * @Project Name DesignPattern
 */
public abstract class FoodMaker {

    public abstract void selectFlour();

    public abstract void chooseIngredients();

    public abstract void putTogether();

    public abstract void bakeAtTemp();

    public abstract void AddOtherTopics();

    public void make() {
        this.selectFlour();
        this.chooseIngredients();
        this.putTogether();
        this.bakeAtTemp();
        this.AddOtherTopics();
        System.out.println("--------------------------");
        System.out.println("You product is ready ");
    }


}
