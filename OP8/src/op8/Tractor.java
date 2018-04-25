/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package op8;

/**
 *
 * @author student
 */
public class Tractor extends Product{
 public Tractor(double price, String name, String describe) {
        super(price, name, describe);
    }
    @Override
    public void buy() {
        System.out.println(
                "I bought a black tractor, capaciticy 2400!");
    }
    @Override
    public void showInfo() {
        System.out.println(
                "Price:" + getPrice()
                + " name:" + getName()
                + " describe:" + getDescribe()
        );
    }
}
