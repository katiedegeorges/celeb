public class Act extends Celebrity{
private String show;
	public Act()
	{
	}
	public Act(String answer, String clue, String sh)
		{
			super(answer, clue);
			show=sh;
		}
	public String getShow()
		{
			return show;
		}
		public String toString()
		{
		return super.toString()+ " The show she is in: "+ this.show;
		}
	}
	