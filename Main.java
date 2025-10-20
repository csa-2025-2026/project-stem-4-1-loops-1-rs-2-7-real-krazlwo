import java.util.Scanner;

public class Main
{
  public static void main(String[] args)
  {
  //Problem 1
  Scanner sc = new Scanner(System.in);
  System.out.println("Enter positive numbers to add. Enter -1 to stop");
  int sum = 0;
  int userInput = 0;

  while (userInput != -1)
  {
    userInput = sc.nextInt();
    sum += userInput;
  }
  sum++;

  System.out.println("The sum is " + sum);


  //Problem 2
  int N;
  System.out.println("how many numbers do you want to enter");
  N = sc.nextInt();
  int max = Integer.MIN_VALUE;

  int counter = 0;
  while (counter < N)
  {
    userInput = sc.nextInt();
    if (userInput > max)
    {
      max = userInput;
    }
    counter++;
  }
  System.out.println("The max is " + userInput);

  //Problem 3
  System.out.println("input a word");
  String str;
  str = sc.nextLine();

  int c = 0;
  while (c < str.length())
  {
    String currentLetter = str.substring(c, c+1);
    if (c % 3 != 2)
    {
      System.out.println(currentLetter);
    }

    c++;
  }

  sc.close();
    } 
  }

