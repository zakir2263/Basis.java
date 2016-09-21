public class AbstractLogic {
    public static void main(String[] args) {
   MuhitPhone obj = new ZakirPhone();
   obj.call();
   obj.move();
   obj.dance();
   obj.cook();}
  }
abstract class MuhitPhone{  //abstract class
    public void call(){
        System.out.println("calling....");}
    public abstract void move();    //abstract method
    public abstract void  dance();
    public abstract void cook();}
abstract class Alifphone extends MuhitPhone{
    public void move(){
        System.out.println("Moving......");    }
    public abstract void dance();
    public abstract void cook();
}
class ZakirPhone extends Alifphone{    //concrete class
    public void dance(){
        System.out.println("Dancing....");
    }
    public void cook(){
        System.out.println("Cooking......");    
}
}
