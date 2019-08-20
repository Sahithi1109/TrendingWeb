class binaryNumber{
	public static void main(String[] args) {
		int num=Integer.parseInt(args[0]);
		int c=0,b=0,i;
		String result="";
			while(num!=0)
		{
			c=num/2;
			b=num%2;
			result=b+result;
			num=c;
		}
		System.out.println(result);
	}
}