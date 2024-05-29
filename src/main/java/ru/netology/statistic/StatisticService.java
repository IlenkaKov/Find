package ru.netology.statistic;
public class StatisticService {
    public long findNax(long[] incomes){
        long currentMax = incomes[0];
        for (long income: incomes){
            if (currentMax< income){
                currentMax=income;
            }
        }
        return currentMax;
    }
}
