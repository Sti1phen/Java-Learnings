package main.java.org.projects.chapter5;
/*
Initialize variables
count =1
variable i =1
x =4
pi =4

Print Table header for series (Pi  Values)
for loop (count 1, to 200, condition: count <=200)
statement
if count ==1
pi =4
else
i +=2
if count/2 =0
    pi -= x/i
else pi +=x/i
Print count, print pi
 */
public class Pi {
    public static void main(String[] args) {
        double count, i = 1,x =4;
        double pi =4;
        System.out.printf("Pi%20s\n", "Value");
//        System.out.printf("%.2f\n", (pi-=x/i));

        for (count =1; count <=2500; count++)
        {
            double y =1;

            if (count == 1) {
                pi = 4;
            } else {
                i += 2;
                if ((count % 2) != 0)
                    pi+=x/i;
               else pi-=x/i;
            }
                System.out.printf("%.2f\t\t\t%.5f\n", count, pi);

            }
        }
    }