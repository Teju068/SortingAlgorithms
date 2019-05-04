package sortingalgorithms;

public class Logger {

    public static void log(String title, String message) {
        System.out.println(title + " : " + message);
    }

    public static void log(String message) {
        System.out.println(message);
    }

    public static void logr(String message) {
        System.out.print(message);
    }

    public static void log(int[] array) {
        for (int i = 0; i < array.length; i++) {
            logr(array[i] +" ");
        }
    }
}