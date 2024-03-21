class Test 
{
	
	void m1() 
	{
		System.out.println("m1() method with 0 arg");
	}
	
	void m1(int a)
	{
		System.out.println("m1() method with int as arg");		
	}
	
	void m1(int a,String s)
	{
		System.out.println("m1() method with int,string as args");
	}
	
	void m1(String s,int a)
	{
		System.out.println("m1() method with string,int as args");
	}

	public static void main(String[] args)
	{
		Test  t = new Test();
		t.m1();
		t.m1(10);
		t.m1("raja",100);
		t.m1(200,"rani");
	}			
	
}