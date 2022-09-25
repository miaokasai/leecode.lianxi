class Police{
    String jingchacode;
    String department;
    String rank;
}
class Policetask extends Police{
    String duty;
    String drill;
    public void speak(){
        System.out.print("我是"+department+"部门的一名"+rank+"。我的警察编号是"+jingchacode);
        System.out.print(",每天"+duty +drill+"。");
    }
}
public class jingcha {
    public static void main(String[] args) {
        Policetask n=new Policetask();
        n.jingchacode="1573";
        n.department="亮剑";
        n.rank="二营长";
        n.duty="发射";
        n.drill="意大利炮";
        n.speak();
    }
}
