package com.visa.prj.entity;

public class Time {

		private int hours;
		private int minutes;
		public Time (int hr,int min) {
			this.hours = hr;
			this.minutes = min;
		}
		
		public int getHours() {
			return this.hours;
		}
		
		public int getMin() {
			return this.minutes;
		}
		
		public  static Time addTime(Time t1, Time t2) {
			Time added = t1;
			added.minutes += t2.minutes;
			added.hours += t2.hours;
			if(added.minutes%60 > 0) {
				added.hours += added.minutes/60;
				added.minutes = added.minutes%60;
			}
			
			return added;
		}
		
		public Time addTime(Time t2) {
			Time added = this;
			added.minutes += t2.minutes;
			added.hours += t2.hours;
			if(added.minutes%60 > 0) {
				added.hours += added.minutes/60;
				added.minutes = added.minutes%60;
			}
			return added;
		}

		
		
}