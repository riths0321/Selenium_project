package accessmodifier;

public class DafaultAccessModifier {

    int x=100;

    void method_1()
    {
        System.out.println("hello sir");
    }
    public static void main(String[] args) {
        DafaultAccessModifier pam=new DafaultAccessModifier();
        pam.method_1();
        System.out.println(pam.x);
    }
}
