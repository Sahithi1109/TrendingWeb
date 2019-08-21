class factorial{
	public static void main(String[] args) {
		int num=Integer.parseInt(args[0]);
		int i,fact=1;
		System.out.println(num);
		
		for(i=num;i>=1;i--)
		{
			fact=fact*i;
		}
		System.out.println("factorial of a number is:"+fact);
	}
}