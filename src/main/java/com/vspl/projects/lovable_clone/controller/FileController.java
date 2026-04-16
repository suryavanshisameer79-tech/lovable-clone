package com.vspl.projects.lovable_clone.controller;

import com.vspl.projects.lovable_clone.dto.project.FileTreeResponse;
import com.vspl.projects.lovable_clone.service.FileService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/projects/{projectId}/files")
@RequiredArgsConstructor
public class FileController {

    private static FileService fileService;

    public ResponseEntity<FileTreeResponse>
}
