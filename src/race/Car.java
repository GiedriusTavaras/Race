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
public class Car  {
    
    private String name;
    int speed;
    int distance;
    private int max;
    
    public Car(String name) {
        this.name = name;
        this.speed = 0;
        this.distance = 0;
        this.max = 200;
    }
    
    public void gazuok(int kiek) {
        if (kiek + this.speed >= this.max) {
            this.speed = this.max;
        } else {
            this.speed += kiek;
        }
    }
    
    public void stabdyk(int kiek) {
        if (this.speed - kiek <= 0) {
            this.speed = 0;
        } else { 
            this.speed = this.speed - kiek;
        }
    }
    
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getDistance() {
        return distance;
    }

    public void setDistance(int distance) {
        this.distance = distance;
    }

    public int getMax() {
        return max;
    }

    public void setMax(int max) {
        this.max = max;
    }
        
}
