package ml.keita.façade;

import ml.keita.interfac.Muscle;

public class MuscleTransversal implements Muscle {
    @Override
    public void contract() {
        System.out.println("Les muscles transversaux se contractent.");
    }

    @Override
    public void relax() {
        System.out.println("Les muscles transversaux se relâchent.");
    }
}


