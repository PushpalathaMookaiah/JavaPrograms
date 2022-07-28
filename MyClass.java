public class MyClass {

    int a;
    String str;


    void display()
    {
        System.out.println(+a);
        System.out.println(str);

    }

    public static void main(String[] args) {

        MyClass ob1 = new MyClass();
        MyClass  ob2 =new MyClass();
        MyClass ob3 = new MyClass();
        MyClass ob4  = new MyClass();
        MyClass ob5 = new MyClass();
         MyClass ob6 = new MyClass();
        MyClass ob7 = new MyClass();

        ob1.a =1;
        ob1.str ="Pushpalatha says Sai I Love you";
        ob1.display();
        ob2.a =2;
        ob2.str ="Latha";
        ob2.display();
        ob3.a =3;
        ob3.str ="Says";
        ob3.display();
        ob4.a =4;
        ob4.str ="Sai";
        ob4.display();
        ob5.a =5;
        ob5.str ="I";
        ob5.display();
        ob6.a =6;
        ob6.str ="Love";
        ob6.display();
        ob7.a =8;
        ob7.str ="You";
        ob7.display();
    }

}
