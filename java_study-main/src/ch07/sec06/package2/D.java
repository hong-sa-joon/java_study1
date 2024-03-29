package ch07.sec06.package2;

import ch07.sec06.package1.A;

public class D extends A {
    public D() {
        super(); // 부모 클래스의 생성자 호출
    }

    public void method1() {
        // 상속관계일 때 (protected 접근 제한자가 있는 )부모 클래스의 필드와 메소드를 사용할 수 있음
        super.field = "value";
        super.method();
    }

    public void method2() {
        // ★ 직접 객체를 생성해서 사용 X
//        A a = new A();
//        a.field = "value";
//        a.method();
    }
}
