package zad2;

import zad1.Laptop;

public class Multiprocessor {
    private int cpus;
    private int cores;
    private double clock;
    public double multicpu_clock;

    Multiprocessor(int cpus, int cores, double clock){
        this.cpus = cpus;
        this.cores = cores;
        this.clock = clock;
    }

    public void equivalentClock(){
        if (cpus > 1 && cores > 1){
            multicpu_clock = ((0.7*cores)*0.8*cpus)*clock;
        }else{
            multicpu_clock = clock;
        }
    }

    public double operationTimeSeqProc(double t){
        equivalentClock();
        return t*clock/multicpu_clock;
    }

    public String toString(){
        return "Cpus:" + getCpus() + " Cores:" + getCores() + " Clock:" + getClock();
    }


    //    gets and sets
    public int getCpus(){
        return cpus;
    }

    public int getCores(){
        return cores;
    }

    public double getClock(){
        return clock;
    }

    public void setCpus(int newCpus){
        this.cpus = newCpus;
    }

    public void setCores(int newCores){
        this.cores = newCores;
    }

    public void setClock(int newClock){
        this.clock = newClock;
    }
}
