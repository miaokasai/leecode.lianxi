class Student {
  String name;
  public void speak(){
      System.out.println("我是江信学院的学生");
  }
}
class softStudent extends Student {
    public void learn(){
        System.out.println("我是"+name+",我正在学习java");
    }
}
public class TestExtends{
    public static void main(String[] args) {
        softStudent ss =new softStudent();
        ss.name ="张三";
        ss.speak();
        ss.learn();
    }
}
