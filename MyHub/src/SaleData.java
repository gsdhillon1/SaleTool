
public class SaleData {
	public static void display(){
		System.out.println("This sale is modified by Nathan recently!");
		System.out.println("Data");
		int data[]={1,23,25,30,45,50};
		int sum=0;
		int tax=5;
		for(int i: data)
		{
			System.out.println(i);
			sum=sum+(i*tax);
		}
		System.out.println("The total accumalated sum is->"+sum);
    }

}
