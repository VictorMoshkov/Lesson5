public class Employee {
    public  String name;
    public  String post;
    public  String email;
    public  String telephone;
    public int salary;
    public int age;
    public Employee(String name, String post, String email, String telephone, int salary, int age){
        this.name = name;
        this.post = post;
        this.email = email;
        this.telephone = telephone;
        this.age = age;
        this.salary = salary;

    }


    public void showInf(){
        System.out.println(name + " " + post + " " + email + " " + telephone + " " + salary + " " + age);
    }


    public int getAge(){
        return age;

    }

}

