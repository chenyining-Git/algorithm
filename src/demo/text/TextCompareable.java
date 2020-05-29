package demo.text;

// 定义一个测试类，测试Student类的比较测试

import demo.sort.Student;

public class TextCompareable {

    public static void main(String[] args) {
        Student stu1 = new Student("张三", 18);

        Student stu2 = new Student("李四",19);

        Student stu3 = new Student("王五", 20);

        Comparable max1 = getMax(stu1, stu2);
        System.out.println(max1);

        Comparable max2 = getMax(stu3, stu2);
        System.out.println(max2);
    }

    public static Comparable getMax(Comparable c1, Comparable c2){
        int cmp = c1.compareTo(c2);
        if (cmp >= 0){
            return c1;
        }else {
            return c2;
        }
    }
}
