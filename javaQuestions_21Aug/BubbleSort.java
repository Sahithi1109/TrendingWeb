import java.util.Scanner;
class BubbleSort{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int []arr=new int[num];
		int i,j,temp,k;
		System.out.println("Enter the elements of an array");
		for(i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.println("Before Sorting");
		for(i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
		for(k=0;k<arr.length-1;k++)
		{	i=0;
			for(j=i+1;j<arr.length-k;j++)
			{
				if(arr[i]>arr[j])
				{
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
				i++;
			}
		}
		System.out.println("After Sorting");
		for(i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
	}

}