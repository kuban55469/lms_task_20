import java.util.InputMismatchException;

public class Parallelepiped1 implements Ploshad{
    @Override
    public void ploshad(double height, double width, double length) {
        double result = 0;
        try{
            if (height > -1 && width > -1 && length > -1) {
                try {
                    if (height <= 20 && width <= 20 && length <= 20) {
                        result = 2 * ((height * length) + (length * width) + (height * width));
                        System.out.println(result);
                    }else {
                        throw new ValueGreaterThan20();
                    }
                } catch (ValueGreaterThan20 e) {
                    System.out.println("Нельзя писать больше 20!");
                }
            }else {
                throw new NegativeNumber();
            }
        }catch (NegativeNumber e) {
            System.out.println("Нельзя писать отрицательное число");
        }
    }

    @Override
    public void obom(double height, double width, double length) {
        double result = 0;
        try{
            if (height > -1 && width > -1 && length > -1) {
                try {
                    if (height <= 20 && width <= 20 && length <= 20) {
                        result = (length*width*height);
                        System.out.println(result);
                    }else {
                        throw new ValueGreaterThan20();
                    }
                } catch (ValueGreaterThan20 e) {
                    System.out.println("Нельзя писать больше 20!");
                }
            }else {
                throw new NegativeNumber();
            }
        }catch (NegativeNumber e) {
            System.out.println("Нельзя писать отрицательное число");
        }
    }
}
