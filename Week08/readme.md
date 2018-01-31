# topics

- final
- static
- abstract
- interface
- polymorphism of interface

----------------------------------------------------


## final
  1. final variable

```java
        final int x;

        x = 5;  //x จะมีค่าเป็น 5 เสมอ   ไม่สามารถเปลี่ยนเป็นค่าอื่นได้
```

  2. final method

        - ทำให้ method ไม่สามารถถูก override ในคลาสลูกได้
```java
     public class Foo {
        public final void doFoo() {
           System.out.println("doFoo");
        }
     }
 ```
 ```java
     public class Boo extends Foo {
        public void doFoo() {  //error cannot override
           System.out.println("doFoo in Boo");
        }
    }
```
  3. final class

        - class นี้มีคลาสลูกไม่ได้
   
   
-------------------------------------------------------------


##  static
- ถ้าไม่ใส่ จำเป็นต้องสร้าง  object มาก่อน ถึงจะเรียกใช้ เมดธอด ตัวแปร หรือ คราส นั้นๆ ได้
- ถ้าใส่ เป็นการเรียกใช้ในระดับ คลาส คือใช้ได้เลย

1. medthod static
```java
public static void doFoo2(){
    System.out.println("Static");
}
```

2. variable static

```java
private static int count;
```

-----------------------------------------------------------
## abstract

### Test 1
```java
  People เป็น abstract class ประกอบด้วยข้อมูลคือ
     private String name;    
   
     //getter and setter
     public abstract void say(String s);

  Student เป็นคลาสลูกของ People

  public static void main(String[] args) {
     Student s = new Student("John");
     s.say("hello");
  }
```
```
  Running
  John say hello hello hello
```

### Test2

```java
Plane is subclass of Vehicle
Parrot is subclass of Bird
   Vehicle
       engine - String
       setter and getter
   Bird
       size - String
       setter and getter
  Flyable is an interface that consists of
       public abstract void fly(double feet);
  objects of bird and plane each want to fly
  The method main is given as follows

  public static void main(String[] args) {
      //Vehicle v = new Vehicle("V6"); //error because cannot 
                                       //create object
      Plane pl = new Plane("Roleroyse");
      Bird b = new Bird("big"); //not use this object in program
      Parrot pa = new Parrot("small");
      pa.setFlightLevel(30.0);
      pl.setFligthLevel(27000.0);
      pa.fly(20.0); pl.fly(30000.0);
  }
  ```
  ```
  Running
  The small parrot fly at 20.0 feet under the flight level
  The plane with Roleroyse engine fly at 30000.0 feet over the flight level
```