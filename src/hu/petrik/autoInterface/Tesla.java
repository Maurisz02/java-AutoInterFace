package hu.petrik.autoInterface;

import java.util.Random;

public class Tesla implements Auto{

    private double sebesseg;

    public Tesla(){
        Random rnd = new Random();

        this.sebesseg = rnd.nextInt(60);
    }

    @Override
    public void gyorsul() {
        Random rnd = new Random();

        this.sebesseg = getSebesseg() + rnd.nextInt(15-5)+5;
    }

    @Override
    public double getSebesseg() {
        return this.sebesseg;
    }
}
