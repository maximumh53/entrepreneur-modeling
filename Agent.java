package model;

import uchicago.src.sim.network.DefaultDrawableNode;

public class Agent extends DefaultDrawableNode {
    public double xI; // entrepreneurial spirit/ability
    public double cI; // cost of assimilation
    public double pI; // productivity
    public double bI; // capital

    public double getxI() {
        return xI;
    }

    public void setxI(double xI) {
        this.xI = xI;
    }

    public double getcI() {
        return cI;
    }

    public void setcI(double cI) {
        this.cI = cI;
    }

    public double getpI() {
        return pI;
    }

    public void setpI(double pI) {
        this.pI = pI;
    }

    public double getbI() {
        return bI;
    }

    public void setbI(double bI) {
        this.bI = bI;
    }

}
