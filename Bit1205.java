package bit;

//class Person {
//    private int age;
//    private String name;
//    private String sex;
//
//    public Person() {
//        this.name = "kk";
//        this.age = 17;
//        this.sex = "女";
//    }
//
//    public void show() {
//        System.out.println("name: " + name + " age: " + age + " sex: " + sex);
//    }
//}
//public class Bit1205 {
//    public static void main(String[] args) {
//        Person p1 = new Person();
//        //调用不带参数的构造函数  如果程序没有提供会调用不带参数的构造函数
//        p1.show();
//    }
//}

//class Person{
//    private int age;
//    private String name;
//    private String sex;
//    public Person(String name,int age,String sex){
//        this.name=name;
//        this.age=age;
//        this.sex=sex;
//    }
//    public void show() {
//        System.out.println("name: " + name + " age: " + age + " sex: " + sex);
//    }
//}
//public class Bit1205 {
//    public static void main(String[] args) {
//        Person p1 = new Person("K", 18, "女");
//        //调用不带参数的构造函数  如果程序没有提供会调用不带参数的构造函数
//        p1.show();
//
//    }
//}

//实例代码块优先于构造函数执行
//class Person{
//    private String name;
//    private int age;
//    private String sex;
//
//    public Person(){
//        System.out.println("I am Person init()!");
//    }
//
//    //实例代码块
//    {
//        this.name="kk";
//        this.age=17;
//        this.sex="女";
//        System.out.println("I am instance init()!");
//    }
//
//    public void show(){
//        System.out.println("name: "+name+" age: "+age+" sex: "+sex);
//    }
//}
//
//public class Bit1205 {
//    public static void main(String[] args) {
//        Person p1 = new Person();
//        p1.show();
//    }
//}

//静态代码块不管生成多少个对象，其只会执行一次，且是最先执行的。
// 静态代码块执行完毕后, 实例代码块（构造块）执行，再然后是构造函数执行。
//class Person{
//    private String name;
//    private int age;
//    private String sex;
//    private static int count=0;
//    public Person(){
//        System.out.println("I am Person init()!");
//    }
//
//    //实例代码块
//    {
//        this.name="kk";
//        this.age=17;
//        this.sex="女";
//        System.out.println("I am instance init()!");
//    }
//
//
//    static{
//        count=10;
//        System.out.println("I am static init()!");
//    }
//
//    public void show(){
//        System.out.println("name: "+name+" age: "+age+" sex: "+sex);
//    }
//}
//
//public class Bit1205 {
//    public static void main(String[] args) {
//        Person p1 = new Person();
//        Person p2 = new Person();
//        p1.show();
//    }
//}


