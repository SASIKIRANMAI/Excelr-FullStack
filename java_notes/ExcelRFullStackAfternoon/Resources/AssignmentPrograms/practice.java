class S 
{
	public static void main(String[] args) 
	{
		int i = 0;//7
        int a = 2;//10
        int b = 3;//-5
        int c = 4;//12
        int d = 5;//-3
        int e = 6;//14
        
        int j = (i++ + ++i - --i * i-- + i++ + ++a - --b + c++ * --d + e++) +
				(i++ + ++i - --i * i-- + i++ + ++a - --b + c++ * --d + e++); 

		System.out.println(j);
	}
}
