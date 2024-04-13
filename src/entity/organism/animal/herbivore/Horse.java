package entity.organism.animal.herbivore;

import entity.map.GameField;
import entity.organism.Organism;
import entity.organism.plant.Grass;
import enum_list.EnumList;

import java.util.concurrent.ThreadLocalRandom;

public class Horse extends Herbivore implements Runnable {
    public static final String ICON = "🐎";
    private static int food = 0;

    public void eat(Organism organism){
        if(food <= FULL_EAT){
            food += Grass.weight;
        }
    }

    @Override
    public String getIcon() {
        return ICON;
    }

    public Horse(EnumList model) {
        super(model);
        this.maxStep = 4;
        this.cellAmount = 20;
        this.weight = 200;
        this.FULL_EAT = 60;
    }
}
