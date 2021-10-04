
public class MyFirstProgram {

    public static void main(String[] args) {
System.out.println("площадь квадрата состороной");

        //Square s = new Square(5);
       // System.out.println("площадь квадрата состороной"+s.l + "=" + s.area());

        //Rectangle r = new Rectangle(4,6);
        //System.out.println("площадь прямоугольника со сторонами"+r.a+ "и" +r.b+ "=" + r.area());

        
    }
    //public static void hello(String somebody) {
       // System.out.println("hello " + somebody + " !!!!!");    }

    // public static double area(Square s) {return s.l * s.l}; эта ф-я перенесена в класс Square и нужно убрать Static.
    //Static нужен лишь для пометки функции, кот. не ассоциированы ни с каким объектом, к кот. можно обращаться напрямую.
    // и теперь в этой программе  вызов такой: s.area() вместо area(s). теперь area это атрибут объекта s класса Square
   // public static double area(Rectangle r) {return r.a * r.b}; эта ф-я перенесена в класс Rectangle


}
