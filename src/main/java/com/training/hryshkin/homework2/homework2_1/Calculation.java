package com.training.hryshkin.homework2.homework2_1;

import java.util.Objects;

public class Calculation {
    private IncomingData incomingData;

    public Calculation (IncomingData incomingData) {
        this.incomingData = incomingData;
    }

    public IncomingData getIncomingData() {
        return incomingData;
    }

    public void setIncomingData(IncomingData incomingData) {
        this.incomingData = incomingData;
    }

    public double calculate(){
        return 4 * Math.pow(Math.PI, 2) * Math.pow(incomingData.getA(), 3)
                        / Math.pow(incomingData.getP(), 2) / (incomingData.getM1() + incomingData.getM2());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Calculation that)) return false;
        return Objects.equals(incomingData, that.incomingData);
    }

    @Override
    public int hashCode() {
        return Objects.hash(incomingData);
    }

    @Override
    public String toString() {
        return "Calculation{" +
                "incomingData=" + incomingData +
                '}';
    }
}
