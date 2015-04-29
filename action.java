	public void actionPerformed(ActionEvent e) {

	}
	public static void main(String[] args) {

	new DayDriver();
	Day week = new Day("Mon");
	System.out.println("Today is " + Week.toString()+".");
	System.out.println("Tomorrow is " + Week.nextDay()+".");
	System.out.println("Yesterday was " +Week.previousDay()+".");
	System.out.println("In four days it will be " +Week.calculateOtherDays(4)+".");
	Day nextWeek = new Day("Tue");
	System.out.println("Today is " + nextWeek.toString()+".");
	System.out.println("In 13 days it will be " +nextWeek.calculateOtherDays(13)+".");
	}
}