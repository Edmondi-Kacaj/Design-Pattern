package structuralpattern.adapterdesignpattern;

import structuralpattern.adapterdesignpattern.birds.IBird;
import structuralpattern.adapterdesignpattern.dog.IDog;

/**
 * @author Edmond Kacaj
 * @date 10/12/2019
 * @YEAR 2019
 * @Project Name DesignPattern
 *
 * create adapter to make possibility to adapt birds with dogs
 * we now birds have different method name
 *
 */
public class DogsAdapter implements IDog {

    private IBird iBird;

    public DogsAdapter(IBird iBird) {
        this.iBird = iBird;
    }

    @Override
    public void walk() {
        this.iBird.fly();
    }

    @Override
    public void barks() {
        this.iBird.chirps();
    }
}
