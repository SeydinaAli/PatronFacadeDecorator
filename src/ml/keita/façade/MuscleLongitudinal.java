package ml.keita.façade;

import ml.keita.interfac.Muscle;

public class MuscleLongitudinal implements Muscle {
    public MuscleLongitudinal() {

    }

    @Override
    public void contract() {
        System.out.println("Les muscles longitudinaux se contractent.");
    }

    @Override
    public void relax() {
        System.out.println("Les muscles longitudinaux se relâchent.");
    }
}



