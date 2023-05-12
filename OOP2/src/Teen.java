public class Teen extends Child {

    public Teen(String name) {
        super(name);
    }
    public int count(int... numbers) {
        int sum = 0;
        for (int i : numbers)
            sum += i;
        System.out.println(this.name + " добавив числа і получилось: " + sum);
        return sum;
    }
    public void write(int time) {
        int words = time * 4;
        System.out.println(this.name + " за виділений час написав стільки слів: " + words);
    }
}
