public class Ceo extends Celebrity{
	private String business;
	public Ceo()
	{
	}
	public Ceo(String answer, String clue, String b)
		{
			super(answer, clue);
			business=b;
		}
	public String getBusiness()
		{
			return business;
		}
		public String toString()
		{
		return super.toString()+ " The business is " + this.business;
		}
	}
	