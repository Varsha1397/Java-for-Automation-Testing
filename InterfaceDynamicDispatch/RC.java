package InterfaceDynamicDispatch;

public class RC {

//i1 I1= new i1(); - you can't create object of interface
    i1 I1; //- reference we create
}
interface i1{}
interface i2{}

class A{}
class B {}

class Test1 extends A{} //ok
class Test2 extends B{}//ok
//class Test3 extends A,B{} // miltiple in - with class not possible - diamond p roblem
class Test4  implements i1{}// yes
//class Test5 extends i2{}// never extends the interfcae should be impliment
class Test5 implements i2{}
class Test6 extends A implements i1,i2{} // possible - seen in selenium also
//class Test7 implements i1{} extends A{} // not poss - frst extends then implement
 //interface i3 extends A{} // interface only implements
//interface i4 implements A{}  not implement class only interface
