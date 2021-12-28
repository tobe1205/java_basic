package day15.poly.basic;

class A{}
class B extends A {}
class C extends A {}
class D extends B {}
class E extends C {}


public class Basic {

    Object x1 = new A();
    A x2 = new B();
    A x3 = new C();
    A x4 = new D();
    A x5 = new E();

//    C z1 = new D();
//    B z2 = new E();
}
