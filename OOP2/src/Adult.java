public class Adult extends Teen {
    double weight;
    double height;
    int age;

    public Adult(String name) {
        super(name);
    }

    public Adult(String name, double weight) {
        super(name);
        this.weight = weight;
    }

    public Adult(String name, double weight, double height) {
        super(name);
        this.weight = weight;
        this.height = height;
    }

    public Adult(String name, double weight, double height, int age) {
        super(name);
        this.weight = weight;
        this.height = height;
        this.age = age;
    }

    public double count(double... numbers) {
        double sum = 0;
        for (double i : numbers)
            sum += i;
        System.out.println(name + " добавив дробові числа і получилось: " + String.format("%.3f", sum));
        return sum;
    }

    public void write(int time) {
        int words = time*6;
        System.out.println(name + " за виділений час написав стільки слів: " + words);
    }
}
