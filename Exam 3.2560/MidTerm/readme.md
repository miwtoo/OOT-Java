1.
MobilePhone m1 = new MobilePhone();
MobilePhone m2 = new MonilePhone("SAMSUNG");
Student s = new Student("JOHN");

m1.setOwner(s);
m1.setBrand("iphone");
m1.setSerialNumber(51454331);
m2.setSerialNumber(59942571);


System.out.println(m1.getOwner().getName()+" is Own "+m1.getBrand()); //มิแน่ใจมันยาวจำมิได้
m1.changeSerialToMax(); // ในchangeSerialToMax เอาค่า Serial Number มาเรียงใหม่ให้ได้ค่าที่มากสุด แล้วก็ปริ้น  System.out.println(Brand+" has serial number is "+SerialNumber+" has change serial number to max is "+ maxserialnumber);
m2.changeSerialToMax();


รันจำไม่ได้ ปล.โจทย์ข้างบนอาจมิตรงตามของ อ เป๊ๆ แต่ก็ใกล้ๆ(เฉพาะข้อนี้)
2.
Robot r = new Robot("x20");

 int[] x = {3,45,3,25,9,25,9,6,10};

r.DuplicateNumber(x);
r.sumUniqueNumber(x);

RUN ---------
Duplicate Number is 3 25 9
Sum of unique number is 61


3.Main
line(1111);
line(32);
line(8);
line(1111,'#');
line(32,'@');
line(8,'*');
line(1111,'#',222);
line(32,'@',233);
line(8,'*',51);
Run-------
====
=====
========

####
@@@@@
********

####======
@@@@@========
********======
