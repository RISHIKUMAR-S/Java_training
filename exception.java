public class exception {
    public static void main(String args[])
        {
            // Taking an empty string
            String str = null;
        try
        {
          // Getting length of a string
          System.out.println(str.length());
        }
        //catch(FileNotFoundException n)
        //{
        //  System.out.println("N/A");
        //}
        catch(Exception n)
        {
          n.printStackTrace();
        }
        System.out.println("program finished");
      }
}
