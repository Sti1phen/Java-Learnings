package main.java.org.example.chapter6;
/*
Main method
Print Table header
Number      Binary     Octal        Hexadecimal
for number to 256
    use method binary, octal and hexa

Create method binary
//do
//
//remainder = number % 2;
//remainderString = remainder + remainderString;
//number /=2;
//while (number is not equal 0)
// Print remainderString


Create method Octal
//do
//
//remainder = number % 8;
//remainderString = remainder + remainderString;
//number /=8;
//while (number is not equal 0)
// Print remainderString

Create method Hexadecimal
//do
//
//remainder = number % 16;
switch for A, B, C, D, E,F
normal
//remainderString = remainder + remainderString;
//number /=16;
//while (number is not equal 0)
// Print remainderString

while (number is not equal 0)
(remainderString = Integer.toString(remainder);
//        strBuilder.append(remainderString);
//        str = strBuilder.toString();)
 */
public class BinaryOctalHexa {

    public static void main(String[] args) {
        System.out.println("Number\t\tBinary\tOctal\tHexadecimal");
        for (int number = 1; number <= 256; number++) {
            System.out.printf("%-6d\t%9s\t%4s\t%3s", number, binary(number),octal(number), hexaDecimal(number));
            System.out.println();
        }
    }

        public static String binary ( int number){
            int remainder;
            StringBuilder remainderString = new StringBuilder();
            do {
                remainder = number % 2;
                remainderString.insert(0, remainder);
                number /= 2;
            } while (number != 0);
            return remainderString.toString();
        }
    public static String octal(int number){
        int remainder;
        StringBuilder remainderString = new StringBuilder();
        do {
            remainder = number % 8;
            remainderString.insert(0, remainder);
            number /=8;

        } while (number !=0);
        return remainderString.toString();
    }
    public static String hexaDecimal(int number){
        int remainder;
        StringBuilder remainderString = new StringBuilder();
        do {
            remainder = number % 16;
            switch (remainder){
                case 15:
                    remainderString.insert(0, "F");
                    break;
                case 14:
                    remainderString.insert(0, "E");
                    break;
                case 13:
                    remainderString.insert(0, "D");
                    break;
                case 12:
                    remainderString.insert(0, "C");
                    break;
                case 11:
                    remainderString.insert(0, "B");
                case 10:
                    remainderString.insert(0, "A");
                    break;
                default:
                    remainderString.insert(0, remainder);
            }
            number /=16;

        } while (number !=0);
       return remainderString.toString();
    }
}


