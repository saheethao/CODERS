## Hello You
This class is an introduction to scanners.<br />
If you want to get input you first create a scanner by the following code:
```
Scanner <variable-name> = new Scanner(System.in);
```
You can get certain values like so
```
System.out.println("String please:");
String str;
str = <variable-name>.next();
System.out.println(str + "!")

System.out.println("int please:");
int num;
num = <variable-name>.nextInt();
System.out.println(num  + "!");

System.out.println("double please:");
double val;
val = <variable-name>.nextDouble();
System.out.println(val  + "!");
```
The console will look like this
```
String please:
hi
hi!
int please:
4
4!
double please:
5.505
5.505!
```
