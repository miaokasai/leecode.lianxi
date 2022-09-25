class people {
    String name;
    String phone;
    public void eat() {
        System.out.print("我喜欢吃");
    }
}
class Student extends people{
    String id;
    String major;
    String school;
    String kecheng;
    String method;
    public void speak(String name,String phone,String id){
        System.out.println("我的名字是"+name+",我的电话号码是"+phone+",身份证号是"+id);
        System.out.println("我是"+school+"的学生，我的专业是"+major);
        System.out.println("我学习"+kecheng+"门课程，我喜欢的学习方式是"+method);
    }
    public void xinxi(String major,String school,String kecheng,String method){
        this.major=major;
        this.kecheng=kecheng;
        this.method=method;
        this.school=school;
    }
    public void eat(){
        System.out.println("我喜欢吃米饭");
    }
}
class teacher extends people  {
    String title;
    String teachcourse;
    String school;
    String salary;
    String methodofteach;
    String methodofjudge;
    public void speak(String name,String phone,String id) {
        System.out.println("我的名字是" + name + ",我的电话号码是" + phone + ",身份证号是" + id);
        System.out.println("我的职位是"+title+",我教的课程是"+teachcourse+",任职学校为"+school);
        System.out.println("我的工资为"+salary+",我喜欢的教学方式是"+methodofteach);
        System.out.println("我的评分标准是"+methodofjudge);
    }
    public void xinxi1(String title,String teachcourse,String school,String salary){
        this.title=title;
        this.salary=salary;
        this.school=school;
        this.teachcourse=teachcourse;
    }
    public void xinxi2(String methodofteach, String methodofjudge){
        this.methodofjudge=methodofjudge;
        this.methodofteach=methodofteach;

    }
    public void eat(){
        System.out.println("我喜欢吃肉");
    }
}
public class person {
    public static void main(String[] args) {
    teacher n=new teacher();
    Student s=new Student();
    s.xinxi("计算机","希望大学","2","上网课");
    s.speak("张三","521","1314");
    s.eat();
    n.xinxi1("院长","语文","希望大学","5000");
    n.xinxi2("上网课","平时成绩+考试成绩");
    n.speak( "李四","857","632");
    n.eat();
    }
}
