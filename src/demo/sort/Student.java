package demo.sort;

// 定义一个Student类，具有age和username两个属性，通过接口Comparable来实现比较

public class Student implements Comparable<Student>{

    private String username;
    private int age;

    public Student() {
    }

    public Student(String username, int age) {
        this.username = username;
        this.age = age;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "年龄比较大的学生：Student{" +
                "username='" + username + '\'' +
                ", age=" + age +
                '}';
    }

    // 定义比较规则
    @Override
    public int compareTo(Student o) {
        return this.getAge() - o.getAge();
    }
}