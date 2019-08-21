class Numbers{
	public static void main(String[] args) {
		for(int i=31;i<=46;i++)
		{
			if(i==38)
			{
				System.out.println("Thirty Eight");
				continue;
			}
			if(i==45)
			{
				System.out.println("Forty Five");
				continue;
			}
			System.out.println(i);
		}
	}
}