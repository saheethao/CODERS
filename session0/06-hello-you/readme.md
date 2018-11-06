## Hello You
This class is an introduction to scanners.<br />
If you want to get input you first create a scanner by the following code:
```
Scanner <variable-name> = new Scanner(System.in);
```
You can get certain values like so
```java
Scanner myScanner = new Scanner(System.in);
System.out.println("String please:");
String str;
str = myScanner.next();
System.out.println(str + "!")

System.out.println("int please:");
int num;
num = myScanner.nextInt();
System.out.println(num  + "!");

System.out.println("double please:");
double val;
val = myScanner.nextDouble();
System.out.println(val  + "!");
```
The console will look like this. Ignore the (input). It is there to remind you of the input the user puts in.
```
String please:
hi (input)
hi!
int please:
4 (input)
4!
double please:
5.505 (input)
5.505!
```
