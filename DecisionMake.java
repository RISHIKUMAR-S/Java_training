public class DecisionMake {
    public static void main(String args[]){
        int c = 5;

        if(c == 1)
            System.out.println("c is 1");
        else if(c == 3)
            System.out.println("c is 3");
        else if(c == 5)
            System.out.println("c is 5");
        else
            System.out.println("c is not found");

            switch (c)
            {
              case 1:
                System.out.println("c is 1");
                break;
              case 3:
                System.out.println("c is 3");
                break;
              case 5:
                System.out.println("c is 5");
                break;
              default:
                System.out.println("c is not found");;
            }

    }
}
