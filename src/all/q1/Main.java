package all.q1;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


public class Main {

    static ArrayList<Department> departments = new ArrayList<>();
    static ArrayList<Employee> employees = new ArrayList<>();

    public static void get_data(){
        Employee e1 = new Employee(101,"raj","hem12@gmail.com",545455445,30000,"Developer",true,21);
        Employee e2 = new Employee(102,"king","ku13@gmail.com",54545545,35000,"Senior Developer",true,33);
        Employee e3 = new Employee(103,"akshay","ma45@gmail.com",34343444,40000,"Business Analyst",true,25);
        Employee e4 = new Employee(104,"ajay","ll56@gmail.com",5434343,20000,"Trainee",true,21);
        Employee e5 = new Employee(105,"neelam","na33@gmail.com",4543443,33000,"Developer",true,23);
        Employee e6 = new Employee(106,"krio","kt11@gmail.com",7677464,31000,"Business Analyst",true,22);
        Employee e7 = new Employee(107,"kajua","kh01@gmail.com",47366373,45000,"Senior Manager",true,36);
        Employee e8 = new Employee(108,"Komal","kl90@gmail.com",787637,25000,"Business Analyst",false,24);
        Employee e9 = new Employee(109,"Sujit","st23@gmail.com",98736733,32000,"Developer",true,20);
        Employee e10 = new Employee(110,"Sumesh","sh11@gmail.com",345676564,34000,"Developer",false,22);
        Employee e11 = new Employee(111,"Rachit","ra88@gmail.com",555272132,25000,"System Engineer",true,23);
        Employee e12 = new Employee(112,"Pratibha","pa44@gmail.com",55572133,40000,"Senior Developer",true,35);
        Employee e13 = new Employee(113,"Priya","pa44@gmail.com",555272134,46000,"Manager",true,25);
        Employee e14 = new Employee(114,"Satyam","am65@gmail.com",5555135,34000,"Developer",false,22);
        Employee e15 = new Employee(115,"Yogendra","ya48@gmail.com",555272136,65000,"Developer",true,23);
        Employee e16 = new Employee(116,"Nakul","ku13@gmail.com",555572137,25000,"Business Analyst",true,31);
        Employee e17 = new Employee(117,"Paresh","ph55@gmail.com",666272138,60000,"Developer",true,21);
        Employee e18 = new Employee(118,"Yamini","yi21@gmail.com",564372139,36000,"Senior Developer",false,40);
        Employee e19 = new Employee(119,"Girish","gh37@gmail.com",854272140,37000,"Business Analyst",true,22);
        Employee e20 = new Employee(120,"Harshita","ha22@gmail.com",555272141,40000,"Senior Developer",true,26);

        employees.add(e1);
        employees.add(e2);
        employees.add(e3);
        employees.add(e4);
        employees.add(e5);
        employees.add(e6);
        employees.add(e7);
        employees.add(e8);
        employees.add(e9);
        employees.add(e10);
        employees.add(e11);
        employees.add(e12);
        employees.add(e13);
        employees.add(e14);
        employees.add(e15);
        employees.add(e16);
        employees.add(e17);
        employees.add(e18);
        employees.add(e19);
        employees.add(e20);


        Department d1 = new Department(11,"TECH", employees);
        Department d2 = new Department(12,"DSG", employees);
        Department d3 = new Department(13,"NDS", employees);
        Department d4 = new Department(14,"BA", employees);
        Department d5 = new Department(15,"BI", employees);
        Department d6 = new Department(16,"QA", employees);
        Department d7 = new Department(17,"Management", employees);
        Department d8 = new Department(18,"IMG", employees);
        Department d9 = new Department(19,"Support", employees);
        Department d10 = new Department(20,"QM", employees);
    }


    public static void main(String[] args) {
        Main.get_data();



        // 1
        System.out.println("---------------------------1----------------------------------");
        List<Employee> e1 = employees.stream().filter(employee -> employee.getSalary()>50000).map(employee -> {
            employee.setDesignation("Manager");
            return employee;
        }).collect(Collectors.toList());
        e1.stream().forEach(System.out::println);

        // 2
        System.out.println("-----------------------------2----------------------------------");
        List<Employee> e2 = employees.stream().filter(employee -> employee.getSalary()<50000).map(employee -> {
            employee.setDesignation("Trainee");
            return employee;
        }).collect(Collectors.toList());
        e2.stream().forEach(System.out::println);

        // 3
        System.out.println("-------------------------------------3-----------------------------------");
        employees.stream().filter(employee -> employee.getDesignation().contains("Trainee"));

        // Scenario 2
        System.out.println("---------------------------------------Scenario 2------------------------------------------------------");
        // 1
        System.out.println("-------------------------------------------1---------------------------------------------------");
        List<Employee> e4 = employees.stream().sorted(((o1, o2) -> o1.getName().compareTo(o2.getName()))).collect(Collectors.toList());
        e4.stream().filter(employee -> employee.getAge()<30).map(employee -> {
            return employee.getName();
        }).forEach(System.out::println);

        // Scenario 3
        System.out.println("-------------------------------Scenario 3-------------------------------------------------------------");
        // 1
        System.out.println("-----------------------------------------------1--------------------------------------------");
        List<Employee> e5 = employees.stream().sorted(((o1, o2) -> o1.getName().compareTo(o2.getName()))).collect(Collectors.toList());
        e5.stream().filter(employee -> employee.isStatus()==true).map(employee -> {
            return employee.getName();
        }).forEach(System.out::println);

        // Scenario 4
        System.out.println("----------------------------------------Scenario 4-----------------------------------------------------------");
        // 1
        System.out.println("--------------------------------------------1----------------------------------------------------");
        List<Employee> e6 = employees.stream().sorted(((o1, o2) -> o1.getId() - o1.getId())).collect(Collectors.toList());
        e6.stream().filter(employee -> employee.getEmail().contains(employee.getEmail())).map(employee -> {
            return employee.getId();
        }).forEach(System.out::println);

        // Scenario 6
        System.out.println("-----------------------------------------Scenario 6--------------------------------------------------------");
        // 1
        System.out.println("------------------------------------------------1----------------------------------------------");
        Integer sum_ages = employees.stream().mapToInt(employees->{
            return employees.getAge();
        }).sum();
        System.out.println(sum_ages);







    }
}
