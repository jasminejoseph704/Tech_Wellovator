import axios from 'axios';

const http = ()=>axios.create({
    baseURL: "http://localhost:8080/"
  });

export default {
    listAll(){
        return http().get("user/exercise/");
    },
    add(exercise){
        return http().post("user/exercise", exercise);
    },
    updateExercise(exercise){
        return http().put(`user/exercise/${exercise.userExerciseId}`, exercise);
    },
    delete(exerciseId){
        return http().delete(`user/exercise/${exerciseId}`);
    },
    getAllExercise(){
        return http().get('user/exercise/');
    },
    getExerciseById(userExerciseId){
        return http().get(`user/exercise/${userExerciseId}`);
    }
    
    
}