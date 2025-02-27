public class Main {
    public static void main(String[] args) {
        int photo = 250000;
        System.out.println("Значение переменной photo с типом int равно " + photo);
        byte album = 25;
        System.out.println("Значение переменной album с типом byte равно " + album);
        short page = 2500;
        System.out.println("Значение переменной page с типом short равно " + page);
        long people = 2500000000L;
        System.out.println("Значение переменной people с типом long равно " + people);
        float capacity = 2.5f;
        System.out.println("Значение переменной capacity с типом float равно " + capacity);
        double numberPi = 3.1415926536;
        System.out.println("Значение переменной numberPi с типом double равно " + numberPi);

        float weight = 27.12f;
        long star = 987678965549L;
        double height = 2.786;
        short day = 569;
        short corner = -159;
        int player = 27897;
        byte door = 67;

        byte teacherLP = 23;
        byte teacherAS = 27;
        byte teacherEA = 30;
        int totalSchoolkid = teacherLP + teacherAS + teacherEA;
        short totalPaper = 480;
        int oneSchoolkidPaper = totalPaper / totalSchoolkid;
        System.out.println("На каждого школьника рассчитано " + oneSchoolkidPaper + " листов бумаги");

        byte productivityPerMinute = 16 / 2;
        byte period1 = 20;
        short period2 = 60 * 24;
        int period3 = period2 * 3;
        int period4 = period2 * 30;
        int productivityPeriod1 = productivityPerMinute * period1;
        System.out.println("За " + period1 + " минут машина произвела " + productivityPeriod1 + " штук бутылок");
        int productivityPeriod2 = productivityPerMinute * period2;
        System.out.println("За " + period2 + " минут машина произвела " + productivityPeriod2 + " штук бутылок");
        int productivityPeriod3 = productivityPerMinute * period3;
        System.out.println("За " + period3 + " минут машина произвела " + productivityPeriod3 + " штук бутылок");
        int productivityPeriod4 = productivityPerMinute * period4;
        System.out.println("За " + period4 + " минут машина произвела " + productivityPeriod4 + " штук бутылок");

        byte totalPaint = 120;
        byte whitePaintOneClass = 2;
        byte brownPaintOneClass = 4;
        int totalClass = totalPaint / (whitePaintOneClass + brownPaintOneClass);
        int totalWhitePaint = totalClass * whitePaintOneClass;
        int totalBrownPaint = totalClass * brownPaintOneClass;
        System.out.println("В школе, где  " + totalClass + " классов, нужно " + totalWhitePaint + " банок белой краски и " + totalBrownPaint + " банок коричневой краски");

        short bananasWeightGr = 5 * 80;
        short milkWeightGr = 200 / 100 * 105;
        short iceCreamWeightGr = 2 * 100;
        short eggsWeightGr = 4 * 70;
        int totalWeightBreakfastGr = bananasWeightGr + milkWeightGr + iceCreamWeightGr + eggsWeightGr;
        float totalWeightBreakfastKg = totalWeightBreakfastGr / 1000f;
        System.out.println("Общий вес завтрака составляет " + totalWeightBreakfastGr + " грамм или " + totalWeightBreakfastKg + " килограмм");

        int totalTargetGr = 7 * 1000;
        int minTargetOneDayGr = 250;
        int maxTargetOneDayGr = 500;
        int ifMin = totalTargetGr / minTargetOneDayGr;
        int ifMax = totalTargetGr / maxTargetOneDayGr;
        int onAverageDays = (ifMin + ifMax) / 2;
        System.out.println("Если терять в весе каждый день по " + minTargetOneDayGr + " грамм, то на похудение уйдёт " + ifMin + " дней");
        System.out.println("Если терять в весе каждый день по " + maxTargetOneDayGr + " грамм, то на похудение уйдёт " + ifMax + " дней");
        System.out.println("Чтобы добиться результата похудения, может потребоваться в среднем " + onAverageDays + " дней");

        int monthSalaryMasha = 67760;
        int monthSalaryDenis = 83690;
        int monthSalaryChristina = 76230;
        float monthSalaryMashaNew = monthSalaryMasha * 1.1f;
        float monthSalaryDenisNew = monthSalaryDenis * 1.1f;
        float monthSalaryChristinaNew = monthSalaryChristina * 1.1f;
        int yearSalaryMasha = monthSalaryMasha * 12;
        int yearSalaryDenis = monthSalaryDenis * 12;
        int yearSalaryChristina = monthSalaryChristina * 12;
        float yearSalaryMashaNew = monthSalaryMashaNew * 12;
        float yearSalaryDenisNew = monthSalaryDenisNew * 12;
        float yearSalaryChristinaNew = monthSalaryChristinaNew * 12;
        float yearGrowthSalaryMasha = yearSalaryMashaNew - yearSalaryMasha;
        float yearGrowthSalaryDenis = yearSalaryDenisNew - yearSalaryDenis;
        float yearGrowthSalaryChristina = yearSalaryChristinaNew - yearSalaryChristina;
        System.out.println("Маша теперь получает " + monthSalaryMashaNew + " рублей. Годовой доход вырос на " + yearGrowthSalaryMasha + " рублей");
        System.out.println("Денис теперь получает " + monthSalaryDenisNew + " рублей. Годовой доход вырос на " + yearGrowthSalaryDenis + " рублей");
        System.out.println("Кристина теперь получает " + monthSalaryChristinaNew + " рублей. Годовой доход вырос на " + yearGrowthSalaryChristina + " рублей");

    }
}