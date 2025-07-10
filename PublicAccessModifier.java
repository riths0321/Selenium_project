package accessmodifier;

public class PublicAccessModifier {

        public int x=100;

        public void method_1()
        {
            System.out.println("hello sir");
        }
        public static void main(String[] args) {
            DafaultAccessModifier pam=new DafaultAccessModifier();
            pam.method_1();
            System.out.println(pam.x);
        }

}
