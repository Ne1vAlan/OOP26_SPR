package Practice_2;

import java.util.Scanner;

class StarTriangle {

    private int width;

    public StarTriangle(int w) {
        width = w; //передача width в public
    }

    public String toString() {
        String result = "";

        for (int i = 1; i <= width; i++) {
            for (int j = 1; j <= i; j++) {
                result += "[*]";
            }
            result += "\n";
        }
        return result;
    }
}

public class Pb_2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of rows: ");
        int rows = sc.nextInt();

        StarTriangle small = new StarTriangle(rows);

        System.out.println(small.toString());

        sc.close();
    }
}
