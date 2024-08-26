package com.phaete;

public class Counter {

    private static int totalCount = 0;
    private int instanceCount = 0;

    public Counter() {
    }

    public static void incrementTotalCount() {
        totalCount++;
    }

    public void incrementInstanceCount() {
        this.instanceCount++;
    }


    public static int getTotalCount() {
        return totalCount;
    }

    public static void setTotalCount(int totalCount) {
        Counter.totalCount = totalCount;
    }

    public int getInstanceCount() {
        return instanceCount;
    }

    public void setInstanceCount(int instanceCount) {
        this.instanceCount = instanceCount;
    }

    @Override
    public String toString() {
        return "Current instance count: " + instanceCount + ".\n" + "Current total count: " + totalCount + ".";
    }
}
