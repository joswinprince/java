/*
An anonymous inner class is a local inner class that does not have a name. It is declared 
and instantiated all in one statement using the new keyword. Anonymous inner classes are 
required to extend an existing class or implement an existing interface. They are useful when 
you have a short implementation that will not be used anywhere else

*/
public class AnonInner {
abstract class SaleTodayOnly{
	abstract int dollarsoff();
}
public int admission(int baseprice)
{
	SaleTodayOnly sale = new SaleTodayOnly()
			{
		int dollarsoff() {
			return 3; }
		};
			
	return baseprice - sale.dollarsoff();
}
}
