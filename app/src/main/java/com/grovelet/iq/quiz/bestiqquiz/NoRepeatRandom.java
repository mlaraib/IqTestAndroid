package com.grovelet.iq.quiz.bestiqquiz;

import java.util.BitSet;
import java.util.Random;

public class NoRepeatRandom {
    private int max;
    private Random random;
    private BitSet used;

    public NoRepeatRandom(int max, long seed) {
        this.max = max;
        this.used = new BitSet(max);
        this.random = new Random(seed);
    }

    public NoRepeatRandom(int max) {
        this(max, System.currentTimeMillis());
    }

    public int next() {
        if (isFinished()) {
            return -1;
        }
        int r;
        do {
            r = this.random.nextInt(this.max);
        } while (this.used.get(r));
        this.used.set(r);
        return r;
    }

    public boolean isFinished() {
        return this.max == this.used.cardinality();
    }

    public void reset() {
        this.used.clear();
    }

    public int getMax() {
        return this.max;
    }
}
