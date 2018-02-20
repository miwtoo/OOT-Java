# Review 1 (Inheritance, polymorhphism, interface)

> method main, reveal, disp are given as follows
> if CC is an interface
> find the missing codes to make the program runs
> without changing codes in main, reveal and disp

```Java
public static void main(String[] args) {
   int[] v = {35, 4219, 5410, 228, 99198, 5555};
   Px p = new Px("px");
   Qx q = new Qx("qx");
   System.out.println("stage 1");
   reveal(p, v); reveal(q, v);
   System.out.println("stage 2");
   disp(p, v, 9); disp(p, v, 5);
}
public static void reveal(Px a, int[]t) {
   a.prt(t);
}
public static void disp(CC c, int[]t, int a) {
   c.qrt(t, a);
}
```

### Running
```
stage 1
px prints 35 4219 5410 228 99198 5555
qx prints 35 439 550 228 9198 5105
stage 2
px prints 35 421 5410 228 18 5555
px prints 3 4219 410 228 99198
```

---------------------------------------------------------


# Review 2 (exception)
```Java
int[]a = {123, 4884, 59124, 338, 9909, 13, 3003};
```
> check data in array a using exception principle

Running
```
123
PalindromeException : 4884
59124
338
ZeroException : 9909
13
ZeroException : 3003
```



-------------------------------------

# Review 3 (String)

> a string is given as follows
```
String s = "orange=20:banana=15:mango=30:grape=40";
```
> separate data using method split and find the total qty

Running
```
ORANGE 20
BANANA 15
MANGO 30
GRAPE 40
Total = 105
```









