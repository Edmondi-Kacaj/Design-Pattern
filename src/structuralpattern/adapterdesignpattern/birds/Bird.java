package structuralpattern.adapterdesignpattern.birds;

import structuralpattern.adapterdesignpattern.dog.IDog;

/**
 * @author Edmond Kacaj
 * @date 10/12/2019
 * @YEAR 2019
 * @Project Name DesignPattern
 */
public class Bird implements IBird {
    @Override
    public void fly() {

        System.out.println(" Birds fly  ");
    }

    @Override
    public void chirps()
    {
        System.out.println(" Birds chirps  ");
    }
}
