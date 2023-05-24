package ml.keita.main;

import ml.keita.façade.MuscleLongitudinal;

public class Main {

        public static void main(String[] args) {
            MuscleLongitudinal muscle = new MuscleLongitudinal();

            muscle = new MuscleLongitudinal();
            muscle.contract();
            muscle.relax();

            muscle = new MuscleLongitudinal();
            muscle.contract();
            muscle.relax();
        }
    }


