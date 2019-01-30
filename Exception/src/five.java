import java.lang.*;
class CheckArrayException extends Exception
{
	CheckArrayException(String m)
	{
		super(m);
	}
}
class five{
	
	public static void main(String args[])
	{
		boolean flag = false;
		int i;
		int sum=0;
		try{
			if(args.length<5)
				throw new CheckArrayException("num<5");
			sum=0;
			for(i=0;i<args.length;i++)
			{
					sum=sum+Integer.parseInt(args[i]);	
				
			}flag = true;
			System.out.println(sum);
		}
		catch(CheckArrayException e)
		{
			System.out.println(e.getMessage());

		}
		catch(Exception e)
		{
			if(flag ==false)
			System.out.println("error");
		}
	}
}