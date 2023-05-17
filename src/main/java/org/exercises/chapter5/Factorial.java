package main.java.org.example.chapter5;

public class Factorial {
    private int number;

    public Factorial(int number) {
        if (number >= 0)
            this.number = number;
        else System.out.println("An invalid number");
    }

    public void setNumber(int number)

    {
        if (number >= 0)
            this.number = number;
        else System.out.println("An invalid number");
    }

    public int getNumber() {
        return number;
    }

    public void factorial()
    {
       int n = getNumber();
        int m =1;
        if (n == 0|| n ==1)
        {
            m =1;
        }

        while (n > 1)
        {
            m *= (n - 1);
            --n;
        }
      System.out.printf("%d", m);
    }

}
