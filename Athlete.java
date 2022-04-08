public class Athlete extends Celebrity
	{
		private String sport;

		public Athlete()
		{
		}
		public Athlete(String answer, String clue, String s)
		{
			super(answer, clue);
			sport=s;
		}
		public String getSport()
		{
			return sport;
		}
		
		public String toString()
		{
		return super.toString()+ " The sport he plays is: " + this.sport;

		}
	}
