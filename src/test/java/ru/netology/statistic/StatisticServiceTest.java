package ru.netology.statistic;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
public class StatisticServiceTest {
    @Test
    void findMax(){
        StatisticService service= new StatisticService();
        long[]incomesInBillons={12,5,8,4,5,3,8,6,11,11,12};
        long expected=12;

        long actual = service.findNax(incomesInBillons);
        Assertions.assertEquals(expected,actual);
    }
}
