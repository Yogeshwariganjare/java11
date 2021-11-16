package Java11;

interface SimpleInterest
{
	public double si(double p,double r,double t);
}
public class java11Assg1 {

	public static void main(String[] args) {
		SimpleInterest s=(var p,var r,var t)->p*r*t/100;
		System.out.println(s.si(300, 60, 5));
	}

}