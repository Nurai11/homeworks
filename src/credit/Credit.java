package credit;

public class Credit {
    private int id;
    private int sum;
    private String period;
    private double percent;
    public static int count;
    public static int sumTotal;
    public static double average;

    public Credit() {
        count++;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getSum() {
        return sum;
    }

    public void setSum(int sum) {
        this.sum = sum;
    }

    public String getPeriod() {
        return period;
    }

    public void setPeriod(String period) {
        this.period = period;
    }

    public double getPercent() {
        return percent;
    }

    public void setPercent(double percent) {
        this.percent = percent;
    }

    public static int getCount() {
        return count;
    }

    public static void setCount(int count) {
        Credit.count = count;
    }


    @Override
    public String toString() {
        return "Sum of credit: " + sum +
                "\nID of credit: " + id +
                "\nPeriod: " + period +
                "\nPercent: " + percent + "%";
    }
}
