package CPP.Lab1_Math;
import java.util.Scanner;

public class FirstLab {
    public static void main(String[] args) { // head method that rule whole program
        Scanner console = new Scanner(System.in);
        Menu(console);
    }

    static void Menu(Scanner console) {
        boolean wannaContinue = true;
        while(wannaContinue){
            TaskAnnouncer(); // output information in console for user
            if(console.hasNextInt()){
                int selector = console.nextInt(); // variable that takes numeric to choose task
                switch(selector){
                    case 1:
                        FirstTask(console);
                        break;
                    case 2:
                        SecondTask(console);
                        break;
                    case 3:
                        ThirdTask(console);
                        break;
                    case 4:
                        FourthTask(console);
                        break;
                    case 5:
                        FifthTask(console);
                        break;
                    case 6:
                        //wannaContinue = false;
                        System.out.println("Программа прекратила работу.");
                        return;
                    default:
                        System.out.println("Такого варианта пока не существует.");
                }
            }
            else{System.out.println("Введенное число или тип не предусмотрены.");}
        }
    }

    static void FirstTask(Scanner console) {
        System.out.println("Выбран - Линейный вычислительный процесс \n ");
        System.out.println("Введите x:");
        if(console.hasNextDouble()){
            double x = console.nextDouble();
            System.out.println("Введите y: ");
            double y = console.nextDouble();
            System.out.println("Введите z:");
            double z = console.nextDouble();
            double result = Math.abs(x - y) * (Math.pow(Math.sin(z), 2) + Math.tan(z));
            System.out.println("Результат вычисления: " + result);
        }
        else{ System.out.println("Введенное число или тип не предусмотрены."); }
    }

    static void SecondTask(Scanner console) {
        System.out.println("Выбран - Разветвленный вычислительный процесс \n ");
        System.out.println("В данном решении, от введенных Х и Z зависит по какому пути будет решаться задача.");
        System.out.println("Введите x:");
        double x = console.nextDouble();
        System.out.println("Введите z:");
        double z = console.nextDouble();
        System.out.println("Введите y:");
        double y = console.nextDouble();
        if (x >= z){
            double resultA = Math.sqrt(y + Math.pow((x+1),3));
            System.out.println("Используется формула: Math.sqrt(y + Math.pow((x+1),3))");
            System.out.println("Результат вычисления: " + resultA);
        }
        else{
            double resultB = z * Math.pow(Math.sin(z), 2) + Math.tan(y);
            System.out.println("Используется формула: z * Math.pow(Math.sin(z), 2) + Math.tan(y)");
            System.out.println("Результат вычисления: " + resultB);
        }
    }

    static void ThirdTask(Scanner console) {
        double a = 0.9;
        double b = 1.8;
        System.out.println("Выбран - Цикличный вычислительный процесс(предусловие) " +
                "\n Используется формула - Math.exp(X*a) +  b / 1 + Math.pow(Math.cos(X), 2) " +
                "\n Пока значение Х1 не будет равно Х2, будут выполняться расчеты.");
        System.out.println("Введите значение для Х1:");
        double xFirst = console.nextDouble();
        System.out.println("Введите значение для Х2:");
        double xLast = console.nextDouble();
        System.out.println("Введите, с каким шагом при каждой итерации будет увеличиваться значение Х1:");
        double hStep = console.nextDouble();

        while(xFirst <= xLast){
            System.out.println("Х1 равен: " + xFirst);
            double resultY = (Math.exp(xFirst*a) +  b) / (1 + Math.pow(Math.cos(xFirst), 2));
            System.out.println("Результат вычисления равен: " + resultY);
            xFirst += hStep;
        }
    }

    static void FourthTask(Scanner console) {
        double a = 0.9;
        double b = 1.8;
        System.out.println("Выбран - Цикличный вычислительный процесс(постусловие) " +
                "\n Используется формула - Math.exp(X*a) +  b / 1 + Math.pow(Math.cos(X), 2) " +
                "\n Пока значение Х1 не будет равно Х2, будут выполняться расчеты." +
                "\n Т.к. это цикл с постусловием, если Х2 > X1, расчет выполниться один раз.");
        System.out.println("Введите значение для Х1:");
        double xFirst = console.nextDouble();
        System.out.println("Введите значение для Х2:");
        double xLast = console.nextDouble();
        System.out.println("Введите, с каким шагом при каждой итерации будет увеличиваться значение Х1:");
        double hStep = console.nextDouble();
        do {

            System.out.println("Х1 равен: " + xFirst);
            double resultY = (Math.exp(xFirst*a) +  b) / (1 + Math.pow(Math.cos(xFirst), 2));
            System.out.println("Результат вычисления равен: " + resultY);
            xFirst += hStep;
        }
        while(xFirst <= xLast);
    }

    static void FifthTask(Scanner console) {
        System.out.println("Выбран - Цикличный вычислительный процесс(параметрический)" +
                "\n Используется формула - Math.exp(X*a) +  b / 1 + Math.pow(Math.cos(X), 2)");
        System.out.println("Введите значение для а:");
        double a = console.nextDouble();
        System.out.println("Введите значение для b:");
        double b = console.nextDouble();
        double[] varsOfX = new double[5];
        for (int i = 0; i < varsOfX.length ; i++) {
            System.out.println("Заполните значение массива для индекса <" + i + ">" );
            varsOfX[i] = console.nextDouble();
            double resultY = (Math.exp(varsOfX[i]*a) + b) / (1 + Math.pow(Math.cos(varsOfX[i]),2));
            System.out.println("Результат вычисления: " + resultY);
            //varsOfX[i]++;
        }
    }

    static void TaskAnnouncer(){  // output information about which method of solving gonna be used
        String StringContent = "\n Вариант №6. \n " +
                "Выберите задание: \n " +
                "1: Линейный вычислительный процесс \n " +
                "2: Разветвленный вычислительный процесс \n " +
                "3: Цикличный вычислительный процесс(предусловие) \n " +
                "4: Цикличный вычислительный процесс(постусловие)  \n " +
                "5: Цикличный вычислительный процесс(параметрический) \n " +
                "6: Выход";
        System.out.println(StringContent);
    }
}