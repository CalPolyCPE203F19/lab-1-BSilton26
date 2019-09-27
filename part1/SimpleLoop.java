class SimpleLoop
{
   public static int sum(int low, int high)
   {
        int sum = 0;
        if (low != high) 
            for (int i = low; i <= high; i++)
    		  sum += i;
        else 
        	sum += low * 2;
        return sum;
   }
}
