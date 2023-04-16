public class InstanceOf {
    public static void main(String[] args) {
      A a = new A();
      B b = new B();
      C c = new C();
      D d = new D();

      if (a instanceof A) System.out.println("a является экземпляром A");
      if (b instanceof B) System.out.println("b является экземпляром B");
      if (c instanceof C) System.out.println("c является экземпляром C");
      if (d instanceof D) System.out.println("d является экземпляром D");
      if (c instanceof A) System.out.println("c является экземпляром A");
      if (a instanceof C) System.out.println("a можно привести к C");
      if (c instanceof A) System.out.println("a можно привести к C");
    }
}
class A{
    int i, j;
}
class B{
    int i, j;
}
class C extends A{
    int k;
}
class D extends A{
    int k;
}
/*
a является экземпляром A
b является экземпляром B
c является экземпляром C
d является экземпляром D
c является экземпляром A
a можно привести к C
 */