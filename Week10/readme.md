จะรับ Exception อะไรอย่าลืม import มาก่อน

- Object
	- Throwable
		- Error
		- Exception
			- FileNotFoundException
			- IOException
			- InterruptedException
			- RuntimeException
				- IndexOutOfBoundsException
					- ArrayIndexOutOfBoundsException
					- StringIndexOutOfBoundsException
				- ArithmeticException

- `Error` เป็นข้อผิดพลาดที่ไม่สามารถแก้ไขและจัดการได้ เช่น VirtualMachineError,OutOfMemoryError

- `Exception` เป็นข้อผิดพลาดที่สามารถแก้ไขหรือจัดการได้ เช่น ArrayIndexOutOfBoundsException, FileNotFoundException

- `FileNotFoundException` ตัวนี้จะเจอกรณีที่ หา File หรือ Path ไม่เจอ วิธีแก้ก็ไปดูตาม path file ว่ามีหรือไม่ หรือ กรณีเขียนใหม่ ดูสิทธิ์ว่าสามารถที่จะ write ได้ไหม
- `IOException` ตัวนี้จะเกิดจากการผิดพลาดของข้อมูล ที่เป็น input output ทั้งหลาย
- `RuntimeException` เป็นข้อผิดพลาดที่อาจหลีกเลี่ยงได้หากมีการเขียนโปรแกรมที่ถูกต้อง
- `IndexOutOfBoundsException` 	เป็นการดักจับความผิดพลาดในกรณีที่ มีการระบุตัวเลขเกินจากขอบเขตบนของ array object เช่น String, Vector
- `ArrayIndexOutOfBoundsException` เป็นการดักจับความผิดพลาดในกรณีที่ มีการระบุตัวเลขเกินขอบเขตบนของ array ที่กำหนดไว้
- `StringIndexOutOfBoundsException` เป็นการดักจับความผิดพลาดในกรณีที่ มีการระบุตัวเลขเกินขอบเขตบนของ String หรือ StringBuffer
- `ArithmeticException` เป็นการดักจับความผิดพลาดในกรณีที่ เกิดความผิดพลาดในการคำนวณ เช่น มีการหารด้วยศูนย์
- `NullPointerException`	เป็นการดักจับความผิดพลาดในกรณีที่ มีการใช้ค่า null กับ object ที่ไม่สนับสนุนค่า null
- `NumberFormatException`	เป็นการดักจับความผิดพลาดในกรณีที่ มีการกำหนดค่า format ของตัวเลขที่ไม่ถูกต้อง

Ref http://code.function.in.th/java/exception

Uncheck exception คือ RuntimeException และคลาสลูกหลาน
คือ ไม่ต้อง throws ตรงข้าง medthod จะส่งให้เอง

Check exception คือ  Exception และลูกหลานที่ไม่ใช่ RuntimeException 
คือ ต้อง  throws ตรงข้าง medthod

บล็อก finally จะทำงานเสมอ

--------------------------------------------------------------------------


1.
```Java
Running :
25 15 40 9
	ArrayIndexOutOfBoundsException: 4
```

2.
```Java
Running :
hello has 5 characters
next character after 0 is
	StringIndexOutOfBoundsException: 5
```
3.
```Java
Running : 
Enter b : 0
	ArithmeticException : / by zero
```

---------------------------------------------------------------------------

กำหนด
	int[] n = {789, 1015, 40, 98521, 45, 4101};
จงเขียนโปรแกรมโดยใช้หลัก exception

```Java
Running :
789
ZeroException : 1015
ZeroException : 40
98521
45
ZeroException : 4101
```

----------------------------------------------------------------------------
```Java
String[] s = {"pen:12", "book:100", "15:15", "ruler:10x", "pencil:50"};
```
ให้เขียนโปรแกรมตรวจสอบ โดยใช้หลักการ exception
แต่ล่ะสตริงประกอบด้วย ชื่อสิ่งของ:จำนวน
```Java
Running :
pen 12
book 100
NameExcption : 15
QtyException : 10x
pencil 50
Total of correct quantity = 162
```
```Java
public static check(....) throws NameException , QtyException 
```