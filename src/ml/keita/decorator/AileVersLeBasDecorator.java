package ml.keita.decorator;

import ml.keita.interfac.Muscle;

public class AileVersLeBasDecorator implements Muscle {

        private Muscle muscle;
        public AileVersLeBasDecorator(Muscle muscles) {
            this.muscle = muscle;
        }
        @Override
        public void contract() {
            muscle.contract();
        }
        @Override
        public void relax() {
            muscle.relax();
            System.out.println("Les ailes s'abaissent.");
        }
    }


