package model;

import java.util.ArrayList;
import java.util.Vector;

import uchicago.src.sim.analysis.DataRecorder;
import uchicago.src.sim.analysis.NumericDataSource;
import uchicago.src.sim.engine.BasicAction;
import uchicago.src.sim.engine.Schedule;
import uchicago.src.sim.engine.SimModelImpl;
import uchicago.src.sim.space.Object2DGrid;
import model.Agent;

public class Main extends SimModelImpl {
    private ArrayList<Agent> agentList;
    private Schedule schedule;
    private Object2DGrid Grid;
    private int gridWidth;
    private int gridHeight;
    private int period;
    private int numAgents;

    @Override
    public String[] getInitParam() {
        return new String[]{"gridWidth", "gridHeight", "numAgents", "period"};
    }

    @Override
    public void begin() {

    }

    @Override
    public void setup() {

    }

    @Override
    public Schedule getSchedule() {
        return null;
    }

    @Override
    public String getName() {
        return "Entrepreneurship Model";
    }

    public int getGridHeight() {
        return gridHeight;
    }

    public void setGridHeight(int n) {
        this.gridHeight = n;
    }

    public int getGridWidth() {
        return gridWidth;
    }

    public void setGridWidth(int n) {
        this.gridWidth = n;
    }

    public int getPeriod() {
        return period;
    }

    public void setPeriod(int period) {
        this.period = period;
    }

    public int getNumAgents() {
        return numAgents;
    }

    public void setNumAgents(int numAgents) {
        this.numAgents = numAgents;
    }
}


