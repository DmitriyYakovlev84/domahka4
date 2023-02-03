import com.sun.security.jgss.GSSUtil;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
    }

    public static void task1() {
        System.out.println("задача 1 ");
        // Задача 1
        //У банка появилось мобильное приложение. Поэтому теперь, когда пользователь заходит на сайт с телефона,
        // ему предлагается скачать приложение с учетом того, какая операционная система у пользователя.
        //
        //Напишите программу, которая определяет, чем пользуется клиент (iOS или Android), и выдает соответствующее
        // сообщение:
        //
        //Для iOS — «Установите версию приложения для iOS по ссылке».
        //Для Android — «Установите версию приложения для Android по ссылке».
        //Объявите переменную clientOS, которая равна 0 или 1 (0 — iOS, 1 — Android).//

        int clientOS = 1;
        if (clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else {
            System.out.println("Установите версию приложения для Android по ссылке");
        }
    }

    public static void task2() {
        System.out.println("задача 2 ");
/*Усложним предыдущую задачу. Теперь нам нужно знать не только операционную систему телефона,
но и год его создания.
Ваша задача — написать программу, которая выдает соответствующее сообщение клиенту при наличии
 двух условий.
Если год выпуска ранее 2015 года, то к сообщению об установке нужно добавить информацию об
 облегченной версии:
Для iOS оно будет звучать так: «Установите облегченную версию приложения для iOS по ссылке».
Для Android: «Установите облегченную версию приложения для Android по ссылке».
Для пользователей телефонов 2015 года выпуска и позже нужно вывести обычное предложение об установке
 приложения.
Для года создания телефона используйте переменную clientDeviceYear, в которой необходимо указать
2015 год.
Важно: вложенность больше двух этажей не допускается (условный оператор внутри условного оператора).
*/
        int clientOS = 0;
        int clientDeviceYear = 2015;
        if (clientOS == 0) {
            if (clientDeviceYear < 2015) {
                System.out.println("Установите облегченную версию приложения для iOS по ссылке");
            } else {
                System.out.println("Установите облегченную версию приложения для Android по ссылке");
            }
        } else {
            if (clientDeviceYear < 2015) {
                System.out.println("Установите облегченную версию приложения для iOS по ссылке");
            } else {
                System.out.println("Установите облегченную версию приложения для Android по ссылке");
            }
        }
    }

    public static void task3() {
        System.out.println("задача 3 ");
   /*Напишите программу, которая определяет, является ли год високосным или нет.
Переменную года назовите year, в которую можно подставить значение интересующего нас года.
 Например, 2021.
Программа должна определять, високосный год или нет, и выводить соответствующее сообщение:
 « …. год является високосным» или «... год не является високосным».
Небольшая справка: високосным является каждый четвертый год, но не является каждый сотый.
Также високосным является каждый четырехсотый год.
*/
        int year = 2021;
        if (year / 4 == 0 && year / 100 != 0 || year / 400 == 0) {
            System.out.println(year + "является високосным ");
        } else {
            System.out.println(year + "  не является високосным ");
        }
    }

    public static void task4() {
        System.out.println("задача 4 ");
/*В банке для клиентов организовывается доставка карт на дом.
Чтобы известить клиента о том, когда будет доставлена его карта,
нужно знать расстояние от офиса до адреса доставки.
Правила доставки такие:
Доставка в пределах 20 км занимает сутки.
Доставка в пределах от 20 км до 60 км добавляет еще один день доставки.
Доставка в пределах 60 км до 100 км добавляет еще одни сутки.
Свыше 100 км доставки нет.
То есть с каждым следующим интервалом доставки срок увеличивается на 1 день.
Напишите программу, которая выдает сообщение в консоль: "Потребуется дней: " + срок доставки.
Объявите целочисленную переменную deliveryDistance = 95, которая содержит дистанцию до клиента.
 */
        int deliveryDistance = 95;
        int deliveryDays = 1;
        if (deliveryDistance > 20) {
            deliveryDays++;
        }
        if (deliveryDistance > 60) {
            deliveryDays++;
        }
        System.out.println(deliveryDays + " Потребуется дней ");
    }

    public static void task5() {
        System.out.println("задача 5 ");

/*Напишите программу, которая определяет по номеру месяца в году,
к какому сезону этот месяц принадлежит. Например, 1-й месяц (он же январь) принадлежит к сезону зима.
Для написания программы используйте оператор switch. Для обозначения номера месяца
используйте переменную monthNumber = 12.
Пропишите условие, при котором программа не будет выполняться (номер месяца больше 13).
*/
        int monthNumber = 5;
        switch (monthNumber) {
            case 12:
            case  1:
            case 2:
                System.out.println("зима");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("осень");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("лето");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("весна");
                break;
            default:
                System.out.println("номер месяца больше 13"+monthNumber);

        }
    }
}





