/**
 * Created with IntelliJ IDEA.
 * User: art
 * Date: 09.07.13
 * Time: 17:54
 * To change this template use File | Settings | File Templates.
 */
import java.util.ArrayList;
import java.util.Scanner;

public class lab1 {
    private static boolean isInt;

    public static int getAvg(ArrayList<Integer> buffer) {
        int sum =0;
        for (int elem: buffer) {
            sum+=elem;
        }
        return (sum/buffer.size());
    }

    public static int getMin(ArrayList<Integer> buffer) {
        int min = buffer.get(0);
        int index = 1;
        while (index < buffer.size()) {
            if (min > buffer.get(index)) {
                min = buffer.get(index);
            }
        }
        return min;
    }

    public static int getMax(ArrayList<Integer> buffer) {
        int max = buffer.get(0);
        int index = 1;
        while (index < buffer.size()) {
            if (max > buffer.get(index)) {
                max = buffer.get(index);
            }
        }
        return max;
    }

    public static int getSum(ArrayList<Integer> buffer) {
        int sum = 0;
        for (int integer: buffer) {
            sum+=integer;
        }
        return sum;
    }

    public static int getProd(ArrayList<Integer> buffer) {
        int sum = 1;
        for (int integer: buffer) {
            sum = sum * integer;
        }
        return sum;
    }

    public static int getDiff(ArrayList<Integer> buffer) {
        int sum = 0;
        for (int integer: buffer) {
            sum-=integer;
        }
        return sum;
    }

    public static void main(String[] args) {
        ArrayList<Integer> buffer = new ArrayList();
        Object buf;
        Scanner scanner = new Scanner(System.in);

        String str = args[0];
        isInt = true;
        try {
            buf = Integer.parseInt(str);
        } catch (NumberFormatException e) {
            try {
                isInt = false;
                buf = Double.parseDouble(str);
            } catch (NumberFormatException i) {
                System.out.println("И всё таки ты хуй");
                System.exit(0);
            }
        }

        if (isInt) {
            System.out.println("integer");
        } else {
            System.out.println("double");
        }
        System.exit(0);

        boolean fl = true;

        while(fl) {
            str = scanner.nextLine();
            /* Считываем стороку */
            if(str.equals("end")) {
                fl = false;
            } else {
                try {
                    buffer.add(Integer.parseInt(str));
                } catch (NumberFormatException e) {
                    System.out.println("Wrong format");
                }
            }
        }
        System.out.println("Среднее значение = " + getAvg(buffer));
        System.out.println("Минимальное значение = " + getMin(buffer));
        System.out.println("Максимальное значение = " + getMax(buffer));
        System.out.println("Произведение = " + getProd(buffer));
        System.out.println("Разность = " + getDiff(buffer));
        System.out.println("Сумма = " + getSum(buffer));
    }
}
