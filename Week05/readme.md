//////// test

ให้สร้างคลาสชื่อ Student
ในคลาสนี้ประกอบด้วย attribute ดังนี้
	name	เป็นข้อมูลแบบสตริง
	id	เป็นข้อมูลแบบสตริง
	age	เป็นข้อมูลแบบจำนวนเต็ม
คลาส Student มี behavevior คือ
 
เมื่อ นี้ทำงานจะพิมว่า <name> is registering <subjct>

Runing
Somchai has id B5901234 and age = 20
Somsak has id B5903333 and age = 19
Somchai is registering English IV
Somsak is registering OOT


////////////////////////////
เรียก encapsulation โดย มี  infomation hiding + getter + setter

infomation hiding การตั้งค่าเป็น private
setter สร้าง mdthod ใว้ set ค่าตัวแปรที่เป็น private
getter สร้าง medthod ใว้ return ค่า ค่าตัวแปรที่เป็น private

medthod ที่เรียกผ่าน objcet ไม่ต้องมี static แค่มี
public void

////////////////////////////
คลาส Wood ประกอบด้วยข้อมูลดังนี้
	side - int
และ setter , getter ที่เกี่ยวข้อง
และมี medthod getArea() เพื่อส่งผลลัพธ์ของพื้นที่ได้

คลาส Box ประกอบด้วยข้อมูลดังนี้
	component - Wood
และ setter , getter ที่เกี่ยวข้อง
และมี medthod getVolume() เพื่อส่งผลลัพธ์ของปริมาตรที่ได้


Runing
Enter side of wood : 2
wood has area = 4
box with wood 5 components has volume = 8