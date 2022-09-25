class People{
    String name;
    String id;
    String sex;
    public void speak(){
        System.out.println("我是"+name+",性别"+sex+",我的身份证号是"+id);
    }
}
class Peoplething extends People{
    public void shuijiao () {
        System.out.print("是人就要睡觉,");
    }
    public void chifan(){
        System.out.print("我喜欢吃肉,");
    }
    public  void zoulu(){
        System.out.print("我每天至少走两百步。");
    }
}
public class person {
    public static void main(String[] args) {
        Peoplething e=new Peoplething();
        e.name="张三";
        e.id="5211314";
        e.sex="0";
        e.speak();
        e.shuijiao();
        e.chifan();
        e.zoulu();
    }
}
