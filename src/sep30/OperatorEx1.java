package sep30;

public class OperatorEx1 
{
	int a;
	
	
	public static void main(String args[]) 
   {
		int i=5;
		//i++;		      // i=i+1;�� ���� �ǹ��̴�. ++i;�� �ٲ� �ᵵ ����� ����. 
		System.out.println(i++); //5
		i=5;		      //	����� ���ϱ� ���� i���� �ٽ� 5�� ����.
		//++i; //6
		System.out.println(++i);//6
	}
}