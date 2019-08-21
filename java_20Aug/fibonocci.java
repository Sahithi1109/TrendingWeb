class fibonocci{
	public static void main(String[] args) {
		int a=1,b=2,c;
		System.out.print(a+" "+b+" ");
		do{
			c=a+b;
			a=b;
			b=c;
			System.out.print(c+" ");
		}
		while(c!=89 || c<89);
	}
}