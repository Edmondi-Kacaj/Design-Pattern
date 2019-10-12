package structuralpattern.adapterdesignpattern;

import structuralpattern.adapterdesignpattern.birds.Bird;
import structuralpattern.adapterdesignpattern.dog.Dog;
import structuralpattern.adapterdesignpattern.dog.IDog;

/**
 * @author Edmond Kacaj
 * @date 10/12/2019
 * @YEAR 2019
 * @Project Name DesignPattern
 *
 * Adapter Pattern is a Structural Design Pattern, and used when we have
 * 2 interface unrelated, to work together
 * Adapter convert (adapt ) one interface  in one interface  excepted by Client
 *  so we convert IBird into IDog
 *
 */
public class AdapterMainClass {

    public static void main(String[] args) {
        // let's call dog
        IDog dog=new Dog();
        System.out.println("----------- DOGS ------------");
        dog.walk();
        dog.barks();
        System.out.println("-----------------------");
        System.out.println("----------- BIRDS -----------");
        // let's call birds now
        IDog birds=new DogsAdapter(new Bird());
        birds.barks();
        birds.walk();
        System.out.println("-----------------------");

    }



}
