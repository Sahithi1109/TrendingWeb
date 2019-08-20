class sumAndCompare{
	public static void main(String[] args) {
		int num1=Integer.parseInt(args[0]);
		int num2=Integer.parseInt(args[1]);
		int num3=Integer.parseInt(args[2]);
		int sum=num1+num2+num3;
		int count=0;
		if(num1>=40)
		{
			count++;
		}
		if(num2>=40)
		{
			count++;
		} 
		if(num3>=40)
		{
			count++;
		}  
		if(sum>=125)
		{
			count++;
		}
		if(count==4)
		{
			System.out.println("PASSING");
		}
		else{
			System.out.println("FAILING");
		}
		
	}
}