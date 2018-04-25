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
public class OP8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Product[] produkty = new Product[10];
        produkty[0] = new Tractor(2400, "Traktor", "Czarny");
        produkty[1] = new Ksiazka(30, "Książka", "Fantasy");
        produkty[2] = new Czekolada(3, "Czekolada", "Mleczna");
        produkty[3] = new Product(10, "Dżem", "Truskawkowy") {
            
            @Override
            public void buy() {
                System.out.println(
                "I bought a jam, it's a strawberry flavour!");
    }

            @Override
            public void showInfo() {
               System.out.println(
                "Price:" + getPrice()
                + " name:" + getName()
                + " describe:" + getDescribe()
        );
            }
        };
        produkty[4] = new Product(2, "Długopis", "Niebieski") {
            @Override
            public void buy() {
                System.out.println(
                "I bought a pen, it's blue!");
    }

            @Override
            public void showInfo() {
               System.out.println(
                "Price:" + getPrice()
                + " name:" + getName()
                + " describe:" + getDescribe()
        );
            }
        };
        produkty[5] = new Product(10, "Polopiryna", "Na ból głowy") {
            @Override
            public void buy() {
                System.out.println(
                "I bought a medicine, it helps with headache!");
    }

            @Override
            public void showInfo() {
                System.out.println(
                "Price:" + getPrice()
                + " name:" + getName()
                + " describe:" + getDescribe()
        );            }
        };
        produkty[6] = new Ksiazka(20, "Książka", "Sci-Fi");
        produkty[7] = new Ksiazka(20, "Książka", "Dramat");
        produkty[8] = new Product(2, "Długopis", "Czarny") {
            @Override
            public void buy() {
                System.out.println(
                "I bought a pen, it's black!");
    }

            @Override
            public void showInfo() {
                System.out.println(
                "Price:" + getPrice()
                + " name:" + getName()
                + " describe:" + getDescribe()
        );
            }
        };
        produkty[9] = new Product(10, "Dżem", "Wiśniowy") {
            @Override
            public void buy() {
                System.out.println(
                        "I bought a jam, it's a cherry flavour!");
            }

            @Override
            public void showInfo() {
                System.out.println(
                "Price:" + getPrice()
                + " name:" + getName()
                + " describe:" + getDescribe()
        );
            }
        };
            for (int i=0;i<10;i++){
                produkty[i].buy();
                produkty[i].showInfo();
                System.out.println("--------------------------------");
            }
    }
         
        
        
        
}
        
        
         