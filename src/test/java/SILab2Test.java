import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SILab2Test {

    @Test
   void multipleConditionTest1() {
        Time time = new Time(-2, 5, 10);
        List<Time> timesList = new ArrayList<>();
        timesList.add(time);
        try {
         SILab2.function(timesList);
        } catch (Exception ex) {
            assertEquals(ex.getMessage(), "The hours are smaller than the minimum");
        }
    }


    @Test
    void multipleConditionTest2() {
        Time time = new Time(25, 15, 20);
        List<Time> timesList = new ArrayList<>();
        timesList.add(time);
        try {
            SILab2.function(timesList);
        } catch (Exception ex) {
            assertEquals(ex.getMessage(), "The hours are grater than the maximum");
        }
    }

    @Test
    void multipleConditionTest3() {
        Time time = new Time(15, -5, 20);
        List<Time> timesList = new ArrayList<>();
        timesList.add(time);
        try {
            SILab2.function(timesList);
        } catch (Exception ex) {
            assertEquals(ex.getMessage(), "The minutes are not valid!");
        }
    }

    @Test
    void multipleConditionTest4() {
        Time time = new Time(15, 62, 15);
        List<Time> timesList = new ArrayList<>();
        timesList.add(time);
        try {
            SILab2.function(timesList);
        } catch (Exception ex) {
            assertEquals(ex.getMessage(), "The minutes are not valid!");
        }
    }

    @Test
    void multipleConditionTest5() {
        Time time = new Time(20, 30, -10);
        List<Time> timesList = new ArrayList<>();
        timesList.add(time);
        try {
            SILab2.function(timesList);
        } catch (Exception ex) {
            assertEquals(ex.getMessage(), "The seconds are not valid");
        }
    }

    @Test
    void multipleConditionTest6() {
        Time time = new Time(15, 20, 80);
        List<Time> timesList = new ArrayList<>();
        timesList.add(time);
        try {
            SILab2.function(timesList);
        } catch (Exception ex) {
            assertEquals(ex.getMessage(), "The seconds are not valid");
        }
    }

    @Test
    void multipleConditonTest7() {
        Time time = new Time(15,12,10);
        List<Time> timesList = new ArrayList<>();
        List<Integer> result = new ArrayList<>();
        timesList.add(time);
        result = SILab2.function(timesList);
        assertEquals(result.get(0).intValue(),time.getHours()*3600 + time.getMinutes()*60 + time.getSeconds());
    }

     @Test
    void multipleConditionTest9() {
        Time time = new Time(24, 10, 0);
        List<Time> timesList = new ArrayList<>();
        timesList.add(time);
        try {
            SILab2.function(timesList);
        } catch (Exception ex) {
            assertEquals(ex.getMessage(), "The time is greater than the maximum");
        }
    }
    @Test
    void multipleConditonTest10() {
        Time time = new Time(24,0,0);
        List<Time> timesList = new ArrayList<>();
        List<Integer> result = new ArrayList<>();
        timesList.add(time);
        result = SILab2.function(timesList);
        assertEquals(result.get(0).intValue(),time.getHours()*3600 + time.getMinutes()*60 + time.getSeconds());
    }

    @Test
    void multipleConditionTest11() {
        Time time = new Time(24, 0, 10);
        List<Time> timesList = new ArrayList<>();
        timesList.add(time);
        try {
            SILab2.function(timesList);
        } catch (Exception ex) {
            assertEquals(ex.getMessage(), "The time is greater than the maximum");
        }
    }

}