public class Child {
    String name;

    public Child(String name) {
        this.name = name;
    }
    public int count(int a, int b){
        int ChildCounting = a + b;
        System.out.println(this.name + " добавив два числа і получилось: " + ChildCounting);
        return ChildCounting;
    }
    public void write(int time){
        int words = time * 2;
        System.out.println(this.name + " за виділений час написав стільки слів: " + words);
    }
}
