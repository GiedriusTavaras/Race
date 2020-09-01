/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package race;

/**
 *
 * @author tavar
 */
public class Race {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Car a = new Car("Audi");
        Car b = new Car("BMW");
        Car c = new Car("Citroen");
        Car d = new Car("Dodge");
        Car e = new Car("Jaguar");
        Car f = new Car("Ferrari");
        SpoilerCar g = new SpoilerCar();
        SpoilerCar h = new SpoilerCar();
        h.setName("SAAB");
        Car[] race = {a, b, c, d, e, f, g, h};

        // Race with array
        int q = 1000; //How many km
        boolean pabaiga = false; //When to stop cikle
        do {
            try {
                Thread.sleep(100); // slowmotion
            } catch (InterruptedException ex) {
                // do nothing
            }
            for (int i = 0; i <= 7; i++) {
                if ((int) (Math.random() * 10 + 1) <= 5) {
                    race[i].gazuok((int) (Math.random() * 5 + 1));
                } else if ((int) (Math.random() * 10 + 1) <= 7) {
                    race[i].stabdyk((int) (Math.random() * 3 + 1));
                }
            }
//            sorting cars by distance
            for (int j = 0; j < race.length - 1; j++) {
                for (int k = j + 1; k < race.length; k++) {
                    if (race[j].distance > race[k].distance) {
                        Car temp = race[k];
                        race[k] = race[j];
                        race[j] = temp;

                    }
                }
            }
//            printing information about race
            for (int i = 0; i < race.length; i++) {
                System.out.print(race[i].getName() + ": speed = " + race[i].speed + "km/h;  total distance = " + race[i].distance + "km");
                race[i].distance += race[i].speed; // count distance
                for (int l = 0; l < race[i].distance / 11; l++) { // moving part
                    System.out.print("-");
                }
                System.out.println("|");
            }
            System.out.println("==================================================================================================================================================================");
//            cheking and printing winner + breaking
            for (int i = 0; i < race.length; i++) {
                if (race[i].distance >= q) {

                    pabaiga = true;
                    System.out.println("And winner is car " + race[i].getName() + " ! ! !");
                    System.out.println("==================================================================================================================================================================");
                    break;
                }
            }
        } while (pabaiga == false);

// Race by IF
//        for (int i = 0; i <= 10000; i++) {
////            Thread.sleep(100);
//            int q = 1000;
//            if ((int) (Math.random() * 10 + 1) <= 5) {
//                a.gazuok((int) (Math.random() * 5 + 1));
//            } else if ((int) (Math.random() * 10 + 1) <= 7) {
//                a.stabdyk((int) (Math.random() * 3 + 1));
//            }
//            System.out.println("===============================");
//            System.out.println("\n");
//            System.out.println("===============================");
//            a.distance += a.speed;
//            System.out.println(a.getName() + " " + a.distance);
//            if (a.distance >= q) {
//                System.out.println("And winner is car 'Audi'");
//                break;
//            }
//            if ((int) (Math.random() * 10 + 1) <= 5) {
//                b.gazuok((int) (Math.random() * 5 + 1));
//            } else if ((int) (Math.random() * 10 + 1) <= 7) {
//                b.stabdyk((int) (Math.random() * 3 + 1));
//            }
//            b.distance += b.speed;
//            System.out.println(b.getName() + " " + b.distance);
//            if (b.distance >= q) {
//                System.out.println("And winner is car 'BMW'");
//                break;
//            }
//            if ((int) (Math.random() * 10 + 1) <= 5) {
//                c.gazuok((int) (Math.random() * 5 + 1));
//            } else if ((int) (Math.random() * 10 + 1) <= 7) {
//                c.stabdyk((int) (Math.random() * 3 + 1));
//            }
//            c.distance += c.speed;
//            System.out.println(c.getName() + " " + c.distance);
//            if (c.distance >= q) {
//                System.out.println("And winner is car 'Citroen'");
//                break;
//            }
//            if ((int) (Math.random() * 10 + 1) <= 5) {
//                d.gazuok((int) (Math.random() * 5 + 1));
//            } else if ((int) (Math.random() * 10 + 1) <= 7) {
//                d.stabdyk((int) (Math.random() * 3 + 1));
//            }
//            d.distance += d.speed;
//            System.out.println(d.getName() + " " + d.distance);
//            if (d.distance >= q) {
//                System.out.println("And winner is car 'Dodge'");
//                break;
//            }
//            if ((int) (Math.random() * 10 + 1) <= 5) {
//                e.gazuok((int) (Math.random() * 5 + 1));
//            } else if ((int) (Math.random() * 10 + 1) <= 7) {
//                e.stabdyk((int) (Math.random() * 3 + 1));
//            }
//            e.distance += e.speed;
//            System.out.println(e.getName() + " " + e.distance);
//            if (e.distance >= q) {
//                System.out.println("And winner is car 'Jaguar'");
//                break;
//            }
//            if ((int) (Math.random() * 10 + 1) <= 5) {
//                f.gazuok((int) (Math.random() * 5 + 1));
//            } else if ((int) (Math.random() * 10 + 1) <= 7) {
//                f.stabdyk((int) (Math.random() * 3 + 1));
//            }
//            f.distance += f.speed;
//            System.out.println(f.getName() + " " + f.distance);
//            if (f.distance >= q) {
//                System.out.println("And winner is car 'Ferrari'");
//                break;
//            }
//            if ((int) (Math.random() * 10 + 1) <= 5) {
//                g.setSpoiler(true);
//            } else {
//                g.setSpoiler(false);
//            }
//            if ((int) (Math.random() * 10 + 1) <= 5) {
//                g.gazuok((int) (Math.random() * 5 + 1));
//            } else if ((int) (Math.random() * 10 + 1) <= 7) {
//                g.stabdyk((int) (Math.random() * 3 + 1));
//            }
//            g.distance += g.speed;
//            System.out.println(g.getName() + " " + g.distance);
//            if (g.distance >= q) {
//                System.out.println("And winner is car 'Tessla'");
//                break;
//            }
//            if ((int) (Math.random() * 10 + 1) <= 5) {
//                h.setSpoiler(true);
//            } else {
//                h.setSpoiler(false);
//            }
//            if ((int) (Math.random() * 10 + 1) <= 5) {
//                h.gazuok((int) (Math.random() * 5 + 1));
//            } else if ((int) (Math.random() * 10 + 1) <= 7) {
//                h.stabdyk((int) (Math.random() * 3 + 1));
//            }
//            h.distance += h.speed;
//            System.out.println(h.getName() + " " + h.distance);
//            if (h.distance >= q) {
//                System.out.println("And winner is car 'YamahaXJ600s'");
//                break;
//            }
    }
}
