import java.util.Scanner;
class ArrayClockWise{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int []arr=new int[num];
		int []arr1=new int[num];
		int i;
		for(i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		arr1[0]=arr[arr.length-1];
		for(i=1;i<arr1.length;i++)
		{
				arr1[i]=arr[i-1];
		}
		System.out.println("After 1 clockwise");
		
		for(i=0;i<arr1.length;i++)
		{
			System.out.print(arr1[i]+" ");
		}
	}
}