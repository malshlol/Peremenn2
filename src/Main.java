public class Main {
    public static void main(String[] args) {
        task1And2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();

    }

    public static void task1And2() {
        System.out.println("Задача 1,2");
        int a = 569;
        System.out.println(a);
        int a2 = 27897;
        System.out.println(a2);
        byte b = 67;
        System.out.println(b);
        short c = -159;
        System.out.println(c);
        long d = 987678965549L;
        System.out.println(d);
        float e = 2.786F;
        System.out.println(e);
        double f = 27.12;
        System.out.println(f);
    }

    public static void task3() {
        System.out.println("Задача 3");
        byte firstClass = 23;
        System.out.println(firstClass);
        byte secondClass = 27;
        System.out.println(secondClass);
        byte thirdClass = 30;
        System.out.println(thirdClass);
        short paper = 480;
        System.out.println(paper);
        int allClass = firstClass + secondClass + thirdClass;
        System.out.println(allClass);
        int paperForPuple = paper / allClass;
        System.out.println(" На каждого ученика рассчитано " + paperForPuple + " листов бумаги");
    }

    public static void task4() {
        System.out.println("Задача 4");
        byte bottle = 16;
        byte time = 2;
        int oneMinPer = bottle / time;
        byte Min20 = 20;
        int performance20Min = oneMinPer * Min20;
        System.out.println("За " + Min20 + " минут машина произвела "
                + performance20Min + " штук бутылок");
        byte dayHour = 24;
        byte minInHour = 60;
        int MinInDay = dayHour * minInHour;
        int perfomDay = MinInDay * oneMinPer;
        System.out.println("За " + MinInDay + " минут машина произвела "
                + perfomDay + " штук бутылок");
        byte day3 = 3;
        int minIn3Day = MinInDay * day3;
        int perfom3Day = minIn3Day * oneMinPer;
        System.out.println("За " + minIn3Day + " минут машина произвела "
                + perfom3Day + " штук бутылок");
        byte mounth = 30;
        int time30Day = mounth * MinInDay;
        int perfomMo = time30Day * oneMinPer;
        System.out.println("За " + time30Day + " минут машина произвела "
                + perfomMo + " штук бутылок");


    }

    public static void task5() {
        System.out.println("Задача 5");
        byte allColour = 120;
        byte whiteCol = 2;
        byte brownCol = 4;
        byte allCol = 6;
        int kolvoNaClass = allColour / allCol;
        int WihColorAll = kolvoNaClass * whiteCol;
        int BrawnColorAll = kolvoNaClass * brownCol;
        System.out.println("В школе, где " + kolvoNaClass + " классов, нужно "
                + WihColorAll + " банок белой краски и " + BrawnColorAll + " банок коричневой краски");


    }

    public static void task6() {
        System.out.println("Задача 6");
        byte banana = 80;
        byte allBanana = 5;
        byte milke = 105;
        float grammMl = milke / 100;
        short allMilk = 200;
        short iceCream = 100;
        byte allIceCream = 2;
        byte egg = 70;
        byte allEgg = 4;
        float breakFast = banana * allBanana + grammMl * allMilk + iceCream * allIceCream + egg * allEgg;
        float breakKg = breakFast / 1000;
        System.out.println("Вес завтрака спортсмена в граммах = " + breakFast + ", а вес в килограммах " + breakKg);


    }

    public static void task7() {
        System.out.println("Задача 7");
        byte weight = 7;
        short kall = 250;
        short kallDob = 500;
        short grammInKg = 7 * 1000;
        int day250 = grammInKg / kall;
        int day500 = grammInKg / kallDob;
        int middleDay = (day250 + day500) / 2;
        System.out.println("Потребуется дней " + day250 + " чтобы сбросить 7 кг при рационе 250грамм " + ", потребуется дней " + day500 + " чтобы сбросить 7 кг при рационе 500грам," + " потребуется дней в среднем " + middleDay);


    }

    public static void task8() {
        System.out.println("Задача 8");
        int salaryMaria = 67760;
        int salaryDenis = 83690;
        int salaryKristina = 76230;
        int oneSalaryMaria = salaryMaria / 100;
        int oneSalaryDenis = salaryDenis / 100;
        int oneSalaryKristina = salaryKristina / 100;
        int newSalaryMaria = salaryMaria + oneSalaryMaria * 10;
        int newSalaryDenis = salaryDenis + oneSalaryDenis * 10;
        int newSalaryKristina = salaryKristina + oneSalaryKristina * 10;
        int oldSalaryMaria = salaryMaria * 12;
        int neewSalaryMaria = newSalaryMaria * 12;
        int oldSalaryDenis = salaryDenis * 12;
        int neewSalaryDenis = newSalaryDenis * 12;
        int oldSalaryKristina = salaryKristina * 12;
        int neewSalaryKristina = newSalaryKristina * 12;
        int difSalNar = neewSalaryMaria - oldSalaryMaria;
        int difSalDen = neewSalaryDenis - oldSalaryDenis;
        int difKr = neewSalaryKristina - oldSalaryKristina;
        System.out.println("Маша теперь получает " + newSalaryMaria +  "рублей. Годовой доход вырос на " + difSalNar + " рублей");
        System.out.println("Денис теперь получает " + newSalaryDenis +  "рублей. Годовой доход вырос на " + difSalDen + " рублей");
        System.out.println("Кристина теперь получает " + newSalaryKristina +  "рублей. Годовой доход вырос на " + difKr + " рублей");

    }
}