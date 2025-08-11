public class Strong
{
public static int calculateFactorial(int n) 
{
if (n == 0 || n == 1) 
{
return 1;
}
int fact = 1;
for (int i = 2; i <= n; i++) 
{
fact *= i;
}
return fact;
}
public static boolean isStrongNumber(int number) 
{
int originalNumber = number;
int sumOfFactorials = 0;
int tempNumber = number;
while (tempNumber > 0) 
{
int digit = tempNumber % 10;
sumOfFactorials += calculateFactorial(digit);
tempNumber /= 10;
}
return sumOfFactorials == originalNumber;
}
public static void main(String[] args) 
{
System.out.println("Strong numbers from 1 to 5000 are:");
for (int i = 1; i <= 5000; i++) 
{
if (isStrongNumber(i)) 
{
System.out.println(i);
}
}
}
}