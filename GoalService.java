package com.dreamforge.service;

import com.dreamforge.model.Goal;
import com.dreamforge.repository.GoalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GoalService {

    @Autowired
    private GoalRepository goalRepository;

    public Goal saveGoal(Goal goal) {
        return goalRepository.save(goal);
    }

    public List<Goal> getAllGoals() {
        return goalRepository.findAll();
    }

    public Goal getGoalById(Long id) {
        return goalRepository.findById(id).orElse(null);
    }

    public void deleteGoal(Long id) {
        goalRepository.deleteById(id);
    }
}
