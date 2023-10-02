// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        // Press Alt+Enter with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.
        System.out.println("Домашка № 2 - ПОЕХАЛИ!!!");

        System.out.println(); // типа сделал отступ:) не знаю, возможно есть команда..

        System.out.println("Задача № 1 - инициализировали, присвоили значения, вывели");

        var dog = 8.0;
        var cat  = 3.6;
        var paper  = 763789 ;

        System.out.println("dog = " + dog);
        System.out.println("cat = " + cat);
        System.out.println("paper = " + paper);
        System.out.println();

        System.out.println("Задача № 2 - увеличил все на 4");
        dog = dog + 4;
        cat = cat + 4;
        paper = paper + 4;
        System.out.println("dog = " + dog);
        System.out.println("cat = " + cat);
        System.out.println("paper = " + paper);

        System.out.println();
        System.out.println("Задача № 3 - что то повычитал");

        dog = dog - 3.5;
        cat = cat - 1.6;
        paper = paper - 7639;

        System.out.println("dog = " + dog);
        System.out.println("cat = " + cat);
        System.out.println("paper = " + paper);

        System.out.println();
        System.out.println("Задача № 4 - поиздевался над переменной friend");

        var friend = 19;
        System.out.println("friend был равен сначала " + friend);
        friend = friend + 2;
        System.out.println("friend потом стал равен  " + friend);
        friend = friend /7;
        System.out.println("и скукожился вконец до   " + friend);

        System.out.println();
        System.out.println("Задача № 5 - Теперь мучаем переменную frog");
        var frog = 3.5;
        System.out.println(frog);
        frog = frog * 10;
        System.out.println(frog);
        frog = frog / 3.5;
        System.out.println(frog);
        frog = frog +4;
        System.out.println(frog);

        System.out.println();
        System.out.println("Задача № 6 - оценка веса боксеров");
        var box1 = 78.2;
        var box2 = 82.7;
        var summBox = box1 + box2;
        var diffBox = box2 - box1;

        System.out.println("Общий вес боксеров равен " + summBox + " кг");
        System.out.println("Разница в весе боксеров составляет " + diffBox + " кг");

        System.out.println();
        System.out.println("Задача № 7 - разница масс спортсменов, метод 2. Метод вычитанием был в предидущей задаче!!!");
        var diffBox2 = box2 % box1;
        System.out.println("Разница в весе боксеров все так же " + diffBox2 + " кг!! :)");

        System.out.println();
        System.out.println("Задача № 8 - про трудочасы...");
        var allTime = 640;
        var sumWorker = allTime / 8;
        System.out.println("Всего работников в компании — " + sumWorker + " человек.");
        sumWorker = sumWorker +94;
        System.out.println("Если в компании работает " + sumWorker + " человека, то всего " + sumWorker * 8 + " часов работы может быть поделено между сотрудниками.");


    }
    }
