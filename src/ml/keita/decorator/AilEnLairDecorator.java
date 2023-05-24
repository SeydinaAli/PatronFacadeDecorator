package ml.keita.decorator;

import ml.keita.interfac.Muscle;

public class AilEnLairDecorator implements Muscle {

        private Muscle muscle;
        public AilEnLairDecorator(Muscle muscle) {
            this.muscle = muscle;
        }
        @Override
        public void contract() {
            muscle.contract();
            System.out.println("Les ailes se relèvent.");
        }
        @Override
        public void relax() {
            muscle.relax();
        }
    }


