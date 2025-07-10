package accessmodifier;

public class PrivateAccessModifier {

    private int x=100;
    private void method_1()
    {
        System.out.println("hello sir");
    }
    public static void main(String[] args) {
        PrivateAccessModifier pam=new PrivateAccessModifier();
        pam.method_1();
        System.out.println(pam.x);
    }
}
