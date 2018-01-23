# Topic

+ Superclass and subclass
+ Access Level
+ Constructor of superclass
+ medthod overidng
+ polymorphisim

---------------------------------------------

Access Level มี 4 ระดับ

1. เข้าถึงได้ ต่าง package keyword `public`
2. เข้าถึงได้ ต่าง package เฉพาะการสือบทอดของคลาสลูก keyword `protected`
3. เข้าถึงได้ เฉพาะ package เดียวกัน keyword `ไม่มี (ไม่ต้องใส่)`
4. เข้าถึงได้ เฉพาะ medthod ในคลาสเดียวกัน keyword `private`

| Modifier | Class | Package | Subclass | World |
| :------: | :---: | :-----: | :------: | :---: |
| public  | Y | Y | Y | Y |
| protected | Y | Y | Y | N |
| no modifier | Y | Y | N | N |
| private | Y | N | N | N |
-----------------------------------------------------------

### Test 1

medthod main is given as follow
Robot is superclass

```java
public static void main(String[] args){
	Robot r = new Robot("X9");
        RobotA a = new RobotA("A2");
        RobotB b = new RobotB();
        b.setName("B3");
        r.sum(123); a.sum(25); b.sum(4444);
        a.printWord("hello");
        //b.printWord("hi");            error if remove comment
        //r.printWord("there");         error if remove comment
}
```

```
Running : 

X9 sum = 6
A2 sum = 7
B3 sum = 16
hello
```
---------------------------------------

## Test 2

```java
public static void main(String[] args){
        Foo f = new Foo("foo");
        Boo b = new Boo("Boo");
        Baz c = new Baz("baz");
        
        int[] n = {15, 25 , 109, 2, 3};
        
        display(f,n);
        display(b,n);
        display(c,n);
    }
    
    public void display(Boo a, .... m){
        a.printData(m);
    }
}

```

```
Runnning :
foo prints 15 25 3         //ไม่ใช่มากสุดกับน้อยสุด
boo prints 15 25 109 2 3   //ปริ้นหมด
baz prints 3 2 109 25 15   //ปริ้นจากหลังไปหน้า
```




