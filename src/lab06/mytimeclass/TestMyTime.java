package lab06.mytimeclass;

public class TestMyTime {
    public static void main(String[] args) {
        MyTime tempTime = new MyTime(12, 59, 30);
        System.out.println("Now is: " + tempTime.toString() + " one hour later is " + (tempTime.nextHour()).toString());
        System.out.println("Now is: " + tempTime.toString() + " one minute before is " + (tempTime.nextMinute()).toString());

        MyTime tempTime2 = new MyTime(0, 0, 0);
        System.out.println("Now is: " + tempTime2.toString() + " one second before is " + (tempTime2.previousSecond()).toString());

        MyTime tempTime3 = new MyTime(23, 59, 59);
        System.out.println("Now is: " + tempTime3.toString() + " one second later is " + (tempTime2.nextSecond()).toString());
    }
}
