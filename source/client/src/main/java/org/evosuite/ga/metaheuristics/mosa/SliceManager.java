package org.evosuite.ga.metaheuristics.mosa;

import org.evosuite.Properties;
import org.evosuite.ga.Chromosome;

public class SliceManager<T extends Chromosome> {

    public static int getCutOff(int popSize) {
        assert Properties.SLICING == true;

        if (Properties.SLICING_APPROACH == Properties.SlicingApproach.ALL)
            return popSize;
        if (Properties.SLICING_APPROACH == Properties.SlicingApproach.TOP) {
            double percentage = Properties.SLICING_CUTOFF;
            return (int) (Math.round(popSize*percentage/100));
        }

        throw new RuntimeException("Unspecified setup for the slicing");
    }
}
