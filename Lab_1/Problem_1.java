package Lab_1;

import java.util.Scanner;

class Data {
    private double sum; //сума
    private double max; //макс
    private int count; //счет

    public Data() {
        sum = 0.0;
        max = Double.NEGATIVE_INFINITY; // сравнивает значение с -беск
        count = 0;
    }

    public void add(double value) {
        sum += value; //сразу прибавляет к сумме
        count++; //+ число
        if (value > max) {
            max = value;
        }
    }

    public double average() {
        if (count == 0) return 0.0;
        return sum / count;
    }

    public double maximum() {
        if (count == 0) return 0.0;
        return max;
    }
}

public class Problem_1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Data data = new Data(); //основной контейнер

        while (true) {
            System.out.print("Enter number (Q to quit): ");
            String input = scanner.next().trim();

            if (input.equalsIgnoreCase("Q")) {
                break;
            }

            try {
                double value = Double.parseDouble(input);

                if (Double.isNaN(value) || Double.isInfinite(value)) {
                    System.out.println("Invalid number."); 
                    continue;
                }

                data.add(value);

            } catch (NumberFormatException e) {
                System.out.println("Invalid input."); //если это не число
            }
        }

        System.out.println("Average = " + data.average());
        System.out.println("Maximum = " + data.maximum());

        scanner.close();
    }
}
