package com.techelevator.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;

import org.springframework.jdbc.support.rowset.SqlRowSet;
import com.techelevator.model.Exercise;

public class ExerciseSqlDAO implements ExerciseDAO {
	private JdbcTemplate jdbcTemplate;

	public ExerciseSqlDAO(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	@Override
	public int findExerciseIdByUsername(String username) {
		return jdbcTemplate.queryForObject("SELECT exercise_id FROM exercises"
				+ "JOIN user_profile ON user_exercises = user_profile.profile_id JOIN users ON users.user_id = user_profile.profile_id"
				+ "WHERE username = ?", int.class, username);
	}

	@Override
	public Exercise create(Exercise exercise) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String updateExercise(Exercise exercise, String username) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Exercise findExerciseByName(String name) {
		// TODO Auto-generated method stub
		for (Exercise exercise : this.listAllExercises()) {
			if (exercise.getName().toLowerCase().equals(name.toLowerCase())) {
				return exercise;
			}
		}
		return null;
	}

	@Override
	public Exercise getExerciseByUsername(String username) {
		// TODO Auto-generated method stub
		Exercise exercise = null;
		String query = "SELECT exercise_id, exercise_category, exercise_name, exercise_length, exercise_description,"
				+ "calories_burn, equipemnt"
				+ "JOIN user_profile ON goals.goal_setter = user_profile.profile_id JOIN users ON users.user_id = user_profile.profile_id "
				+ "WHERE username =?";
		SqlRowSet results = this.jdbcTemplate.queryForRowSet(query, username);
		if (results.next()) {
			exercise = this.mapRowToExercise(results);
		}
		return exercise;
	}

	@Override
	public List<Exercise> listAllExercises() {
		// TODO Auto-generated method stub
		return null;
	}

	private Exercise mapRowToExercise(SqlRowSet rs) {
		Exercise exercise = new Exercise();
		exercise.setExerciseId(rs.getInt("exercise_id"));
		exercise.setCategory(rs.getString("category"));
		exercise.setName(rs.getString("name"));
		exercise.setDuration(rs.getInt("duration"));
		exercise.setDescription(rs.getString("description"));
		exercise.setCaloriesBurned(rs.getInt("calories_burn"));
		exercise.setUsername(rs.getString("username"));
		return exercise;

	}

}
