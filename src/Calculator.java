
public class Calculator {

		int a;
		int b;
Calculator (int a,int b)
{
        this.a=a;
		this.b=b;
	}
	int add()
	{
		return(a+b);
	}
int sub()
{
	return(a-b);
}
int mul()
{
	return(a*b);
}
int div()
{
	if(this.b==0){
		System.out.println("second num should not be 0 ");
	return 0;
}
return(a/b);


}
}