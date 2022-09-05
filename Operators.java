public class Operators {
        public static void main(String[] args)
        {
            double num1 = 25.75f;
            int num2 = 2;

            // Arithmetic Operators
            System.out.println("sum of num1 and num2 = " + (num1 + num2));
            System.out.println("subraction of num1 and num2 = " + (num1 - num2));
            System.out.println("multiplication of num1 and num2 = " + (num1 * num2));
            System.out.println("division of num1 and num2 = " + (num1 / num2));
            System.out.println("Modulus of num1 and num2 = " + (num1 % num2));

            // unary operator
            System.out.println(" unary negative " + (-num1));
            System.out.println(" not operator inverts the value " + !(num1 > num2));
            System.out.println(" preincrement " + (++num2)); // it adds before the action
            System.out.println(" postincrement " + (num2++)); // it adds after the action
            System.out.println(" 1's compliment " + (~4));

            // Asignment Operators
            int sum = 0;
            sum += 5;  // it equals to sum = sum + 5;
            System.out.println(" assignment " + (sum));

            // relational operators
            System.out.println(" equals to " + (4 == num2));
            System.out.println(" not equals to " + (num1 != 5));
            System.out.println(" graater than or equal to " + (7 >= num2));
            System.out.println(" less than " + (4 <= num2));

            // logical operators
            System.out.println(" and operators " + (4 == num2 && 1 > 7)); // checks if both condition are true
            System.out.println(" or operators " + (4 == num2 || 1 > 7)); // checks if any 1 condition is true
            System.out.println(" not operators " + !(1 > 7)); // inverts the value

            // ternary operator
            String v = (3 % 2 != 0) ? "odd" : "even" ;
            

        }
    }

