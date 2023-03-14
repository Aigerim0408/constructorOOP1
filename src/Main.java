public class Main {
    public static void main(String[] args) {
        Rectangle rect = new Rectangle(5,5,2,3);
        Rectangle rect1 = new Rectangle();
        rect1.sideA = 2;
        rect1.sideB = 3;
        rect.sideC = 3;
        rect.sideD = 2;
        System.out.print(rect + "\n" + rect1);
    }
}