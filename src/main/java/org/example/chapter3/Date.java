package org.example.chapter3;

//Question 3.14 Date Class
// Class Date with day/month/year as instance variables

public class Date
{
	private int month;
	private int day;
	private int year;
	
	public Date(int month, int day, int year)
	{
		if (month > 0 && month <= 12)
		this.month = month;
		
		if (month == 4 || month == 6 ||month ==  9 || month == 11)
		{
		if (day > 0 && day < 31)
		this.day = day;
		}
		
		if (month == 2)
		{if (day > 0 && day < 30)
		this.day = day;
		}
		
		if (month == 1 ||month == 3 || month == 5 || month == 7 || month == 8 ||month == 10 || month == 11 ||month == 12)
		{if (day > 0 && day < 32)
		this.day = day;
		}
		
		if (year > 0 && year < 9999)
		this.year = year;

	}
		
		public void setMonth(int month)
		{
			if (month > 0 && month <= 12)
			this.month = month;
		}
		
		public int getMonth()
		{
			return month;
		}
		
		public void setDay(int day)
		{
			if (month == 4 || month == 6 ||month ==  9 || month == 11)
			{
				if (day > 0 && day < 31)
				this.day = day;
			}
		
				if (month == 2)
			{
				if (day > 0 && day < 30)
				this.day = day;
			}
		
				if (month == 1 ||month == 3 || month == 5 || month == 7 || month == 8 ||month == 10 || month == 11 ||month == 12)
			{
				if (day > 0 && day < 32)
				this.day = day;
			}
		}
		
		public int getDay()
		{
			return day;
		}
			
		public void setYear(int year)
		{
			if (year > 0 && year < 9999)
			this.year = year;
		}
		
		public int getYear()
		{
			return year;
		}
		
	public void displayDate()
	{
	
	System.out.printf("%d/%d/%d\n", month, day, year);
		
	}
	
}

