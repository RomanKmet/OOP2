public class Main {
    public static void main(String[] args) {
        Child choosenChild = new Child("Віктор");
        Teen choosenTeen = new Teen("Данило");
        Adult choosenAdult = new Adult("Ярослав",54);

        choosenChild.count(5,10);
        choosenTeen.count(53,15,532,76,43);
        choosenAdult.count(54.3,123,34.8,43.4);
        System.out.println();
        choosenChild.write(40);
        choosenTeen.write(40);
        choosenAdult.write(40);
    }
}
