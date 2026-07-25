package com.portfolio.backend.service;

import com.portfolio.backend.model.Project;
import com.portfolio.backend.repository.ProjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProjectService {

    @Autowired
    private ProjectRepository projectRepository;

    public List<Project> getAllProjects() {
        return projectRepository.findAll();
    }

    public Optional<Project> getProjectById(Long id) {
        return projectRepository.findById(id);
    }

    public Project createProject(Project project) {
        return projectRepository.save(project);
    }

    public Project updateProject(Long id, Project projectDetails) {
        return projectRepository.findById(id).map(project -> {
            project.setTitle(projectDetails.getTitle());
            project.setDescription(projectDetails.getDescription());
            project.setImageUrl(projectDetails.getImageUrl());
            project.setProjectUrl(projectDetails.getProjectUrl());
            project.setGithubUrl(projectDetails.getGithubUrl());
            project.setTechnologies(projectDetails.getTechnologies());
            project.setStatus(projectDetails.getStatus());
            return projectRepository.save(project);
        }).orElseThrow(() -> new RuntimeException("Project not found with id " + id));
    }

    public void deleteProject(Long id) {
        projectRepository.deleteById(id);
    }
}
