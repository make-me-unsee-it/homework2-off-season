package com.training.hryshkin.homework2.homework2_1;

import java.util.Objects;

public class IncomingData {
    private int a;
    private int p;
    private double m1;
    private double m2;

    public IncomingData(String[] args) {
        try {
            a = Integer.parseInt(args[0].trim());
        } catch (NumberFormatException nfe) {
            nfe.printStackTrace();
        }
        try {
            p = Integer.parseInt(args[1].trim());
        } catch (NumberFormatException nfe) {
            nfe.printStackTrace();
        }
        try {
            m1 = Double.parseDouble(args[2].trim());
        } catch (NumberFormatException nfe) {
            nfe.printStackTrace();
        }
        try {
            m2 = Double.parseDouble(args[3].trim());
        } catch (NumberFormatException nfe) {
            nfe.printStackTrace();
        }
    }

    public int getA() {
        return a;
    }

    public int getP() {
        return p;
    }

    public double getM1() {
        return m1;
    }

    public double getM2() {
        return m2;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof IncomingData that)) return false;
        return a == that.a && p == that.p && Double.compare(that.m1, m1) == 0 && Double.compare(that.m2, m2) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(a, p, m1, m2);
    }

    @Override
    public String toString() {
        return "IncomingData{" +
                "a=" + a +
                ", p=" + p +
                ", m1=" + m1 +
                ", m2=" + m2 +
                '}';
    }
}
