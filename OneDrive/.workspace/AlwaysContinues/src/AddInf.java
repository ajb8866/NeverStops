
public class AddInf {
	String limit;
	int value;
	double total;
	public AddInf(String limit, int value)
	{
		this.limit = limit;
		this.value = value;
	}
	
	public void calcValuesToLimit()
	{
		double limitValue = Double.parseDouble(limit);
		for (int x = 0; x < limitValue; ++x )
		{
			value = value + x;
		}
	}

}
