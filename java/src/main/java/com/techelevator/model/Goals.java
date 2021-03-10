package com.techelevator.model;

public class Goals {
	private int goalId;
	private int goalSetterId;
	private String date;
	private String category;
	private String activity;
	private int timesPerWeek;
	private int duration;
	private boolean isCompleted;
	public int getGoalSetterId() {
		return goalSetterId;
	}
	public void setGoalSetterId(int goalSetterId) {
		this.goalSetterId = goalSetterId;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	
	public int getGoalId() {
		return goalId;
	}
	public void setGoalId(int goalId) {
		this.goalId = goalId;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public String getActivity() {
		return activity;
	}
	public void setActivity(String activity) {
		this.activity = activity;
	}
	public int getTimesPerWeek() {
		return timesPerWeek;
	}
	public void setTimesPerWeek(int timesPerWeek) {
		this.timesPerWeek = timesPerWeek;
	}
	public int getDuration() {
		return duration;
	}
	public void setDuration(int duration) {
		this.duration = duration;
	}
	public boolean isCompleted() {
		return isCompleted;
	}
	public void setCompleted(boolean isCompleted) {
		this.isCompleted = isCompleted;
	}

	public Goals() {
		
	}
	
	
	
}