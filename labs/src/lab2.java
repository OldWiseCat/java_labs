import java.util.Random;
import java.util.Vector;

/**
 * Created with IntelliJ IDEA.
 * User: art
 * Date: 11.07.13
 * Time: 19:36
 * To change this template use File | Settings | File Templates.
 */


public class lab2 {
    private static int RADIAN = 0;
    private static int GRAD = 1;
    private static boolean isRad = false;
    private static boolean isRand = true;

    private static double gradToRad(Double angle) {
        return (angle * Math.PI / 180);
    }

    private static double stripFractionalPart(double digit, int digits) {
        return (double) Math.round(digit * (StrictMath.pow(10, digits))) / (StrictMath.pow(10, digits));
    }

    public static double getSumSinuses(Vector<Double> angles, int type) {
        double sum = 0;
        for (double angle : angles) {
            if (type == GRAD) {
                sum += Math.sin(gradToRad(angle));
            } else {
                sum += Math.sin(angle);
            }
        }
        return sum;
    }

    public static double getSumSinuses(Vector<Float> angles, int type, int digits) {
        double sum = 0;
        for (double angle : angles) {
            if (type == GRAD) {
                sum += Math.sin(gradToRad(angle));
            } else {
                sum += Math.sin(angle);
            }
        }
        return stripFractionalPart(sum, digits);
    }

    public static double getSumCosinuses(Vector<Double> angles, int type) {
        double sum = 0;
        for (double angle : angles) {
            if (type == GRAD) {
                sum += Math.cos(gradToRad(angle));
            } else {
                sum += Math.cos(angle);
            }
        }
        return sum;
    }

    public static double getSumCosinuses(Vector<Double> angles, int type, int digits) {
        double sum = 0;
        for (double angle : angles) {
            if (type == GRAD) {
                sum += Math.cos(gradToRad(angle));
            } else {
                sum += Math.cos(angle);
            }
        }
        return stripFractionalPart(sum, digits);
    }

    public static double getDifSinuses(Vector<Double> angles, int type) {
        double dif = 0;
        for (double angle : angles) {
            if (type == GRAD) {
                dif -= Math.sin(gradToRad(angle));
            } else {
                dif -= Math.sin(angle);
            }
        }
        return dif;
    }

    public static double getDifSinuses(Vector<Double> angles, int type, int digits) {
        double dif = 0;
        for (double angle : angles) {
            if (type == GRAD) {
                dif -= Math.sin(gradToRad(angle));
            } else {
                dif -= Math.sin(angle);
            }
        }
        return stripFractionalPart(dif, digits);
    }

    public static double getDifCosinuses(Vector<Double> angles, int type) {
        double dif = 0;
        for (double angle : angles) {
            if (type == GRAD) {
                dif -= Math.cos(gradToRad(angle));
            } else {
                dif -= Math.cos(angle);
            }
        }
        return dif;
    }

    public static double getDifCosinuses(Vector<Double> angles, int type, int digits) {
        double dif = 0;
        for (double angle : angles) {
            if (type == GRAD) {
                dif -= Math.cos(gradToRad(angle));
            } else {
                dif -= Math.cos(angle);
            }
        }
        return stripFractionalPart(dif, digits);
    }

    public static double getMulSinuses(Vector<Double> angles, int type) {
        double mul = 1;
        for (double angle : angles) {
            if (type == GRAD) {
                mul = mul * Math.sin(gradToRad(angle));
            } else {
                mul = mul * Math.sin(angle);
            }
        }
        return mul;
    }

    public static double getMulSinuses(Vector<Double> angles, int type, int digits) {
        double mul = 1;
        for (double angle : angles) {
            if (type == GRAD) {
                mul = mul * Math.sin(gradToRad(angle));
            } else {
                mul = mul * Math.sin(angle);
            }
        }
        return stripFractionalPart(mul, digits);
    }


    public static double getMulCosinuses(Vector<Double> angles, int type) {
        double mul = 0;
        for (double angle : angles) {
            if (type == GRAD) {
                mul = mul * Math.cos(gradToRad(angle));
            } else {
                mul *= Math.cos(angle);
            }
        }
        return mul;
    }

    public static double getMulCosinuses(Vector<Double> angles, int type, int digits) {
        double mul = 0;
        for (double angle : angles) {
            if (type == GRAD) {
                mul = mul * Math.cos(gradToRad(angle));
            } else {
                mul *= Math.cos(angle);
            }
        }
        return stripFractionalPart(mul, digits);
    }


    public static void main(String[] args)
            throws NoSuchArgumentException {
        Vector<Double> angles = new Vector<Double>();
        for (String str : args) {
            try {
                angles.add(Double.parseDouble(str));
            } catch (NumberFormatException i) {
                //В джаве сравниваются не сами строки, а указатели на них. Надо пользоваться методом equals
                try {
                    if (str.equals("rad")) {
                        isRad = true;
                    } else if (str.equals("random")) {
                        isRand = true;
                    } else if (!str.equals("grad")) {
                        throw new NoSuchArgumentException(str);
                    }
                } catch (NoSuchArgumentException noArg) {
                    System.out.println("Неверный аргумент командной строки " + noArg.argument);
                    System.exit(-1);
                }
            }
        }
        if (isRand) {
            angles.clear();
            Random randomizer = new Random();
            for (int i = 0; i < 10; i++) {
                angles.add(randomizer.nextDouble());
            }
        }
        double sinSum;
        double cosSum;
        double sinDiff;
        double cosDiff;
        double mulSin;
        double mulCos;

        if (isRad) {
            sinSum = getSumSinuses(angles, RADIAN);
            cosSum = getSumCosinuses(angles, RADIAN);
            sinDiff = getDifSinuses(angles, RADIAN);
            cosDiff = getDifCosinuses(angles, RADIAN);
            mulSin = getMulSinuses(angles, RADIAN);
            mulCos = getMulCosinuses(angles, RADIAN);
        } else {
            sinSum = getSumSinuses(angles, GRAD);
            cosSum = getSumCosinuses(angles, GRAD);
            sinDiff = getDifSinuses(angles, GRAD);
            cosDiff = getDifCosinuses(angles, GRAD);
            mulSin = getMulSinuses(angles, GRAD);
            mulCos = getMulCosinuses(angles, GRAD);
        }

        System.out.println("Сумма синусов = " + sinSum);
        System.out.println("Сумма косинусов = " + cosSum);
        System.out.println("Разность синусов = " + sinDiff);
        System.out.println("Разность косинусов = " + cosDiff);
        System.out.println("Произведение синусов = " + mulSin);
        System.out.println("Произведение косинусов = " + mulCos);
    }
}
