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
public class SpoilerCar extends Car {

    private boolean spoiler;

    public boolean isSpoiler() {
        return spoiler;
    }

    public void setSpoiler(boolean spoiler) {
        this.spoiler = spoiler;
    }

    public SpoilerCar() {
        super("Tesla");
    }
   
    public void gazuok(int kiek) {
        super.gazuok(kiek);
        if ((int) (Math.random() * 10 + 1) <= 5) {
            spoiler = true;
        } else {
            spoiler = false;
        }
        if (this.spoiler == false) {
            this.speed += kiek;
        }
    }

    public void stabdyk(int kiek) {
        if (this.spoiler == true) {
            super.stabdyk(kiek*2);
        } else {
            super.stabdyk(kiek);
        }
    }

}
