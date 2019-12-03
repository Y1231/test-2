package bit;

//class Person{
//    public String name="张三";
//    public int age=17;
//}
//public class Bit1203 {
//    public static void main(String[] args) {
//        Person person=new Person();
//        System.out.println(person.name);
//        System.out.println(person.age);
//
//    }
//}

//class Person{
//    public int age=17;
//    public String name="李四";
//
//    public void show(){
//        System.out.println("我是"+name+"，今年"+age+"岁");
//    }
//}
//public class Bit1203{
//public static void main(String[]args){
//        Person person=new Person();
//        person.show();
//        }
//}

//面向对象的三大特征：封装
//封装：保护性与降低复杂程度

//private:修饰属性  方法
//只能在本类中使用，外部根本不知道private属性或方法的存在
//属性 一

//class Person{
//    public int age=17;//实例变量  存放在对象内
//    public String name;//实例变量
//    public String sex;//实例变量
//    public static int count;//类变量也叫静态变量，编译时已产生，属于类本身，且只有一份，存放在方法区
//    public final int SIZE=10;//被final修饰的对象叫常量，也属于对象，后续不可改
//    public static final int COUNT=99;//静态的常量，属于类本身，只有一份，被final修饰，后续不可改
//}
////实例成员函数
//public void eat(){
//    int a=10;
//    System.out.println("eat()");
//}
////实例成员函数
//public void sleep(){
//    System.out.println("sleep()");
//}
////静态成员函数
//public static void staticTest() {
//    //不能访问非静态成员
//    //sex="man";error
//    System.out.println("StaticTest()");
//}
//}
//public class Main{
//    public static void main(String[] args) {
//        //产生对象 实例化对象
//        Person person = new Person;//person为对象的引用
//        System.out.println(person.age);
//        System.out.println(person.name);
//        System.out.println(Person.count);
//        System.out.println(Person.COUNT);
//        Person.staticTest();
//        //总结：所有被static所修饰的方法或者属性，全部不依赖于对象
//        person.eat();
//        person.sleep();
//    }
//}
//
//    }
//}


//线性表
//动态数组：长度可以变化的动态数组
public class Bit1203{
    public void add(int data){

    }
    public void  add(int index,int data){

    }
    public int find(int data){
        return -1;
    }
    public boolean contains(int data){
        return false;
    }
    public boolean remove(int data){
        return false;
    }
    public boolean set(int index,int data){
        return false;
    }
}
