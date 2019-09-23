class SimpleIf
{
   public static double max(double x, double y)
   {
      	if (x > y) 
      		return x;
      	if (y > x)
      		return y;

    	return 0; // clearly not correct -- but testable
   }
}
