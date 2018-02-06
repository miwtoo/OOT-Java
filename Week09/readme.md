﻿# String

- หาความยาวของสตริง
    ```Java
    ชื่อตัวแปร.length();
    ```
- ดูอักขระ
    ```Java
    ชื่อตัวแปร.charAt(ตำแหน่งในอาเรย์);
    ```
- การแปลงค่าสตริง
    - แปลงไปเป็นตัวอักษรตัวใหญ่
        ```Java
        ชื่อตัวแปร.toUpperCase();
        ```
    - แปลงไปเป็นตัวอักษรตัวเล็ก
        ```Java
        ชื่อตัวแปร.toLowerCase();
        ```
- แปลงสตริงไปเป็นตัวเลข
    ```Java
    Integer.valueOf(ชื่อตัวแปรสตริง);
    Float.valueOf(ชื่อตัวแปรสตริง);
    Long.valueOf(ชื่อตัวแปรสตริง);
    Double.valueOf(ชื่อตัวแปรสตริง);
    ```
    ตัวอย่าง
        ```Java
        int id = Integer.valueOf(idString);
        ```

- แปลงตัวเลขเป็นสตริง
    ```Java
    int id = 123;
    String idString = ""+id;
    ```

- การเปรียบเทียบสตริง
    ```Java
    สตริงตัวแรกที่ต้องการเปรียบเทียบ.equals(สตริงตัวแรกที่ต้องการเปรียบเทียบ);
    ```
- หาอินเด็กซ์ตัวแรกของอักขระที่ต้องการ
    ```Java
    ตัวแปรสตริง.indexOf(อักขระที่ต้องการหา);
    ```
- หาอินเด็กซ์ตัวสุดท้ายของอักขระที่ต้องการ
    ```Java
    ตัวแปรสตริง.lastIndexOf(อักขระที่ต้องการหา);
    ```
- ตัดช่องว่างออกจากสตริง
    ```Java
    ตัวแปรสตริง.trim();
    ```
---------------------------------------------------
## Test1


```Java
String s = "hEllo";
```

```
Running :
hEllo
HELLO
hello
HeLLO
```




--------------------------------------------------
## โจทย์ข้ออื่นๆ
-----------------------------------------------------
```Java
String s = "35";
int num = Integer.valueOf(s);
```
------------------------------------------------------
```Java
int num = 35;
String s = "";
s += 35;
```
----------------------------------------------------------

```Java
String s = "license";
String t = "silence";
```
anagram -> ตัวอักษรมีเหมือนกัน , ยาวเท่ากัน 

------------------------------------------------------------
```Java
 String s = "headmastererer";

System.out.println(findFirst(s,'e'));
System.out.println(findFirst(s,'z'));
```

```
Running :
1
-1
```
-------------------------------------------------------------

```Java
String s = "   hello   ";

s = trim(s);

System.out.printIn
```