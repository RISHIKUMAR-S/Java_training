import java.lang.Math;
public class NewFloat{
    int leftOfDotValue;
    int rightOfDotValue;
    public NewFloat( int left){
      leftOfDotValue = left;
      rightOfDotValue = 0;
    }
    public NewFloat( int left, int right){
      leftOfDotValue = left;
      rightOfDotValue = right;
    }
    public void print()
    {
      System.out.println ( leftOfDotValue + "." +rightOfDotValue);
    }
    public NewFloat addInteger( int value){
      return new NewFloat(leftOfDotValue + value, rightOfDotValue);
    }
    public NewFloat addNewFloat (NewFloat valNewFloat){
      int max = (valNewFloat.rightOfDotValue >= rightOfDotValue) ? valNewFloat.rightOfDotValue : rightOfDotValue ;
      int count = 0 ;
      while(max >= 0){
        max /= 10;
        count++;
      }
      int digit = (int)(Math.pow((double)10,(double)(count - 1)));
      int addRight = (valNewFloat.rightOfDotValue > rightOfDotValue) ? (rightOfDotValue * digit) + valNewFloat.rightOfDotValue : rightOfDotValue + (digit * valNewFloat.rightOfDotValue );
      int righPart = addRight % (digit*10);
      int carryOver = addRight / (digit*10);
      int addLeft = leftOfDotValue + valNewFloat.leftOfDotValue + carryOver;
      return new NewFloat(addLeft, righPart );
    }
    public NewFloat doubleMe()
    {
      int doubleRight = rightOfDotValue * 2;
      int righPart = doubleRight % 10;
      int carryOver = doubleRight / 10;
      int doubleLeft = (leftOfDotValue * 2) + carryOver;
      return new NewFloat(doubleLeft, righPart );
    }
    public static void main (String [] s){
      NewFloat obj = new NewFloat(4,5);
      NewFloat obj2 = new NewFloat(4);
      NewFloat obj3 = new NewFloat(5,5);
      NewFloat obj4 = new NewFloat(3,14);
      NewFloat obj5 = new NewFloat(5,6);
      obj.doubleMe().print();
      obj.print();
      obj.addNewFloat(obj3).print();
      obj.print();
      obj2.print();
      obj2.addInteger(5).print();
      obj4.doubleMe().addNewFloat(obj5).print();
    }
  }
