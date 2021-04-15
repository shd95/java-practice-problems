public class EqualityOfLinesUC2 {

public static void main(String[] args) {
// cartesian co-ordinates of first line
int X1=2;
int X2=4;
int Y1=3;
int Y2=5;
//cartsian co-ordinates of second line
int A1=3;
int A2=5;
int B1=4;
int B2=8;
// computation
double lengthLine1 = Math.pow((X2-X1),2) + Math.pow((Y2-Y1),2);
double lengthLine2 = Math.pow((A2-A1),2) + Math.pow((B2-B1),2);

System.out.println("First line length is: " + lengthLine1);
System.out.println("Second line length is: " + lengthLine2);

if (lengthLine1 ==  lengthLine2)
System.out.println("Both lines are equal");
else
System.out.println("Both lines are not equal");
	}
}
