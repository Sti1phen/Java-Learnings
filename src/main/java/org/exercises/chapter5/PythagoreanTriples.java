package main.java.org.example.chapter5;
/* Display Pythagorean Triples (sides not more than 500)
Initialize side1, side2, hypotenus
Print Table header
for hyp =1 hyp <=500; hyp++

    for side1 =1 side1 <=500 side1++

        for side2 side2<=500 side2++
        if side2 sq + side1 sq = hyp2
        Print side1, side2, hyp
 */
public class PythagoreanTriples {
    public static void main(String[] args) {
        int side1, side2, hypotenus;

        System.out.println("\t\tPythagorean Triples\nSide 1\t\tSide 2\t\tHypotenus");

            for (side1=1; side1<=500; side1++) {
                for (side2=1; side2 <= 500; side2++) {
                    for (hypotenus=1; hypotenus<=500; hypotenus++) {
                    if (((Math.pow( side1, 2) +Math.pow(side2, 2))==Math.pow(hypotenus, 2)) && side2 > side1)
                    {
                        System.out.printf("%3d\t\t\t%3d\t\t\t%3d\n", side1, side2, hypotenus);
                    }

                }
            }
        }
    }
}