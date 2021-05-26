Втора лабораториска вежба по Софтверско инженерство

Кутановска Сања, бр.на индекс 193045

Група 9

Control Flow Graph
 
![Control flow graph]( https://github.com/sanjakutanovska/SI_2021_lab2_193045/blob/main/Control%20flow%20graph.jpg)


Цикломатска комплексност

Цикломатската комплексност на овој код е 2, истата ја добив преку формулата CC=E-V+2, каде што Е е број на рабови, V е број на јазли. Во случајов E=26, V=20 па CC=26-20+2=8

Тест случаи според Multiple condition

    if(hr<0||hr>24)
    test1 TX Time(-2, , ) hr<0, min=any, sec=any
    test 2 FT Time(25, , ) hr>24, min=any, sec=any  

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

    if(min<0||min>59)		
    test 3	TX	Time(15,-5,  ) 0<hr<24, min<0, sec=any
    test 4	FT	Time(15,62,  ) 0<hr<24, min>59, sec=any

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

    if(sec>=0 && sec<=59)		
    test 5	FX	Time(20,30,-10) 0<hr<24, 0<=min<=59, sec<0
    test 6	TF	Time(15,20,80) 0<hr<24, 0<=min<=59, sec>59
        test 7	TT	Time(15,12,10) 0<hr<24, 0<=min<=59, sec<=59

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

    if(hr==24 && min==0 && sec==0)
    test 8	FXX	hr≠24 опфатено со претходните тестови
    test 9	TFX	Time(24,10, ) h=24, min≠0, sec=any
    test 10	TTT	Time(20,0,0) h=24, min=0, sec=0
    test 11	TTF	Time(20,30,-10) hr=24, min=0, sec≠0

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

Тест случаи според Every branch
![Every_branch_tabela](https://github.com/sanjakutanovska/SI_2021_lab2_193045/blob/main/Every_branch%20tabela.jpg)

Сите гранки може да се изминат со тестовите 1,2,3,5,6,9,10 од Multiple condition.

