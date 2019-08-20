class table{
	public static void main(String[] args) {
		int num=Integer.parseInt(args[0]);
		int limit=Integer.parseInt(args[1]);
		int result;
		for(int i=1;i<=limit;i++)
		{
			result=num*i;
			System.out.println(num+" "+"*"+" "+i+" "+"="+" "+result);
		}
	}
}