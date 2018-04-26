
package op8;

public class OP8 {

    public static void main(String[] args) {
//        Product[] produkty = new Product[10];
//        produkty[0] = new Tractor(2400, "Traktor", "Czarny");
//        produkty[1] = new Ksiazka(30, "Książka", "Fantasy");
//        produkty[2] = new Czekolada(3, "Czekolada", "Mleczna");
//        produkty[3] = new Product(10, "Dżem", "Truskawkowy") {
//
//            @Override
//            public void buy() {
//                System.out.println(
//                "I bought a jam, it's a strawberry flavour!");
//    }
//
//            @Override
//            public void showInfo() {
//               System.out.println(
//                "Price:" + getPrice()
//                + " name:" + getName()
//                + " describe:" + getDescribe()
//        );
//            }
//        };
//        produkty[4] = new Product(2, "Długopis", "Niebieski") {
//            @Override
//            public void buy() {
//                System.out.println(
//                "I bought a pen, it's blue!");
//    }
//
//            @Override
//            public void showInfo() {
//               System.out.println(
//                "Price:" + getPrice()
//                + " name:" + getName()
//                + " describe:" + getDescribe()
//        );
//            }
//        };
//        produkty[5] = new Product(10, "Polopiryna", "Na ból głowy") {
//            @Override
//            public void buy() {
//                System.out.println(
//                "I bought a medicine, it helps with headache!");
//    }
//
//            @Override
//            public void showInfo() {
//                System.out.println(
//                "Price:" + getPrice()
//                + " name:" + getName()
//                + " describe:" + getDescribe()
//        );            }
//        };
//        produkty[6] = new Ksiazka(20, "Książka", "Sci-Fi");
//        produkty[7] = new Ksiazka(20, "Książka", "Dramat");
//        produkty[8] = new Product(2, "Długopis", "Czarny") {
//            @Override
//            public void buy() {
//                System.out.println(
//                "I bought a pen, it's black!");
//    }
//
//            @Override
//            public void showInfo() {
//                System.out.println(
//                "Price:" + getPrice()
//                + " name:" + getName()
//                + " describe:" + getDescribe()
//        );
//            }
//        };
//        produkty[9] = new Product(10, "Dżem", "Wiśniowy") {
//            @Override
//            public void buy() {
//                System.out.println(
//                        "I bought a jam, it's a cherry flavour!");
//            }
//
//            @Override
//            public void showInfo() {
//                System.out.println(
//                "Price:" + getPrice()
//                + " name:" + getName()
//                + " describe:" + getDescribe()
//        );
//            }
//        };
//            for (int i=0;i<10;i++){
//                produkty[i].buy();
//                produkty[i].showInfo();
//                System.out.println("--------------------------------");
//            }






        FiguraGeometryczna[] figura = new FiguraGeometryczna[15];
        figura[0] = new Kwadrat(3);
        figura[1] = new Prostokat(3,5);
        figura[2] = new Trojkat(3,5);
        figura[3] = new Szescian(3);
        figura[4] = new Kula(5);
        figura[5] = new Stozek(8,3,5);

        int i=0;
        while (i<=5){
        System.out.println(figura[i].toString());
            System.out.println();
            i++;
        }

        /*Za każdym razem metoda toString() wyświetla inne wyniki
        * za każdym razem dla innej figury
        * */
    }
}
        
        
         