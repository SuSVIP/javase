package tarena.spring.day01;
public class UserBean {
    public void show(){
        System.out.println("显示hello信息。。。");
        HelloBean hello=new HelloBean();
        hello.sayhello();
    }
}
