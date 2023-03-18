public  class Insertionsort implements Strategy{
    public double[] sort_strategy(double arr[])	
    {    
        double n = arr.length;
        int j=1;
        double swap=0.0;
        for(j=1;j<n;j++)
        {
           swap=arr[j];
           int i;
           for(i=j-1;i>=0;i--)		
           {
           		if(swap>=arr[i])
           			break;
           		else
           			arr[i+1]=arr[i];
           }
           arr[i+1]=swap;
        }
        return arr;
    }
}public class Insertionsort implements Strategy{
	public double[] sort_strategy(double[] arr);
	double n = arr.length;
	int i=1;
	


}
