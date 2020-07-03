package sist.com.oop;

class Time {
	private int hour;
	private int minute;
	private int second;
	private String time;

	public int getHour() {
		return hour;
	}

	public int getMinute() {
		return minute;
	}

	public int getSecond() {
		return second;
	}

	public void setHour(int hour) {
		if (hour < 0 || hour > 23)
			return;
		this.hour = hour;
	}

	public void setMinute(int minute) {
		if (minute < 0 || minute > 59)
			return;
		this.minute = minute;
	}

	public void setSecond(int second) {
		if (second < 0 || second > 59)
			return;
		this.second = second;
	}

	public void disp() {
		if (hour > 12) {
			hour -= 12;
			System.out.print("오후 " + hour + "시 ");
		} else {
			System.out.print("오전 " + hour + "시 ");
		}
		System.out.print(minute + "분 ");
		System.out.print(second + "초\n");
	}

}

class Time2 {
	int hour;
	int minute;
	int second;

	public Time2() {
		this("");

	}

	public Time2(String time) {
		this("t4", 6);
		System.out.println("");
	}

	public Time2(String time, int hour) {
		System.out.println("TIME:" + time + " HOUR: " + hour);
	}

}

class Time3 {
	private int hour;
	private int minute;
	private int second;
	private int day;

	public boolean isSixty(int min_sec) {
		return min_sec > 59;
	}

	public boolean is24(int hour) {
		return hour > 23;
	}

	public Time3(int hour, int minute, int second) {
		while (is24(hour)) {
			if (hour > 23) {
				this.day++;
				this.hour = hour - 24;
				hour = this.hour;
			}
		}
		if (hour < 0)
			return;
		this.hour = hour;

		while (isSixty(minute)) {
			if (minute > 59) {
				this.minute = minute - 60;
				this.hour++;
				minute = this.minute;
			}
		}
		if (minute < 0) {
			return;
		} else
			this.minute = minute;
		while (isSixty(second)) {
			if (second > 59) {
				this.second = second - 60;
				this.minute++;
				second = this.second;
			}
		}
		if (second < 0)
			return;
		else
			this.second = second;
	}

	public void disp1() {
		while (is24(hour)) {
			if (hour > 23) {
				this.hour = hour - 24;
				this.day++;
				hour = this.hour;
			}
		}
		while (isSixty(minute)) {
			if (minute > 59) {
				this.minute = minute - 60;
				this.hour++;
				minute = this.minute;
			}
		}
		if (this.hour > 11) {
			if (this.hour == 12)
				System.out
						.println(this.day + "일 " + "오후 " + this.hour + "시 " + this.minute + "분 " + this.second + "초\n");
			else if (this.hour == 24) {
				this.hour -= 12;
				this.day++;
				System.out
						.println(this.day + "일 " + "오전 " + this.hour + "시 " + this.minute + "분 " + this.second + "초\n");
			} else if (this.hour > 12) {
				this.hour -= 12;
				System.out
						.println(this.day + "일 " + "오후 " + this.hour + "시 " + this.minute + "분 " + this.second + "초\n");
			}
		} else
			System.out.println(this.day + "일 " + "오전 " + this.hour + "시 " + this.minute + "분 " + this.second + "초\n");
	}
}

public class TimeTest {
	public static void main(String[] args) {
		Time t1 = new Time();
		Time t2 = new Time();
		Time t3 = new Time();

		t1.setHour(18);
		t1.setMinute(30);
		t1.setSecond(29);
		t1.disp();

		t2.setHour(8);
		t2.setMinute(45);
		t2.setSecond(46);
		t2.disp();

		t3.disp();
		Time2 t4 = new Time2();
		Time3 t5 = new Time3(23, 59, 60);
		t5.disp1();

	}
}
