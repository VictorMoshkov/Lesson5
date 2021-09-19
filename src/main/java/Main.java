import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc1 = new Scanner(System.in);
        Employee[] person = new Employee[5];
        person[0] = new Employee("Иванов Иван Иванович","Уборщик", "ivanov@mail.ru", "898711111", 10000, 40);
        person[1] = new Employee("Сергеев Сергей Сергеевич","Программист", "ser@mail.ru", "89873333", 20000, 34);
        person[2] = new Employee("Андреев Андрей Анреевич ","Тестировщик", "andr@mail.ru", "898744444", 30000, 56);
        person[3] = new Employee("Костин Константин Константинович","Дизайнер", "kost@mail.ru", "89875555", 40000, 21);
        person[4] = new Employee("Алексеев Алексей Алексеевич","Бухгалтер", "aleks@mail.ru", "898766666", 50000, 43);


        for (int i = 0; i < person.length; i++ ){
            if ((person[i].getAge() > 40)){
                person[i].showInf();

            }

        }
    }

}

