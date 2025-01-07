package com.rahul.task_management_app.repository;

import com.rahul.task_management_app.entity.Task;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TaskRepository extends JpaRepository<Task, Long> {
}
