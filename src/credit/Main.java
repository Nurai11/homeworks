package credit;

public class Main {
    public static void main(String[] args) {
        Credit credit1 = new Credit();
        credit1.setSum(200000);
        credit1.setId(12345);
        credit1.setPeriod("12 months");
        credit1.setPercent(22);
        System.out.println(credit1);
        System.out.println();


        Credit credit2 = new Credit();
        credit2.setSum(150000);
        credit2.setId(123451);
        credit2.setPeriod("18 months");
        credit2.setPercent(22);
        System.out.println(credit2);
        System.out.println();

        Credit credit3 = new Credit();
        credit3.setSum(100000);
        credit3.setId(123452);
        credit3.setPeriod("6 months");
        credit3.setPercent(22);
        System.out.println(credit3);
        System.out.println();

        Credit credit4 = new Credit();
        credit4.setSum(200000);
        credit4.setId(123453);
        credit4.setPeriod("2 year");
        credit4.setPercent(22);
        System.out.println(credit4);
        System.out.println();

        Credit credit5 = new Credit();
        credit5.setSum(200000);
        credit5.setId(123454);
        credit5.setPeriod("12 months");
        credit5.setPercent(22);
        System.out.println(credit5);
        System.out.println();


        System.out.println("Выдано кредитов: " + Credit.count);

        Credit.sumTotal = credit1.getSum() + credit2.getSum() + credit3.getSum() +
                credit4.getSum() + credit5.getSum();
        System.out.println("Общая сумма кредитов: " + Credit.sumTotal);
        Credit.average = Credit.sumTotal / Credit.count;
        System.out.println("Средняя сумма кредитов: " + Credit.average);


        // Задание В
        System.out.println("1.Инкапсуляция - это сокрытие реализации и защита данных от внешних изменений.");
        System.out.println("1.Модификаторы доступа и пакеты");
        System.out.println("2.Наследование - позволяющий описать новый класс на основе уже существующего(базового/родительского.");
        System.out.println("2.Отец-сын(глаза, характер могут  наследоваться от отца к сыну) ");
        System.out.println("3.Static - это модификатор, применяемый к полю, блоку, методу или внутреннему классу");
        System.out.println("4.Чтобы указывает на  привязку субъекта  к текущему классу.");
        System.out.println("5.Да.");
        System.out.println("6.Можно обратиться к ней в программе по имени класса. ");
        System.out.println("7.Сделать setter private and public getter.. ");

    }
}
