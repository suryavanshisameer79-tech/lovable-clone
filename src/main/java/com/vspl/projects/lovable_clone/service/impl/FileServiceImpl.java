package com.vspl.projects.lovable_clone.service.impl;

import com.vspl.projects.lovable_clone.dto.project.FileContentResponse;
import com.vspl.projects.lovable_clone.dto.project.FileTreeResponse;
import com.vspl.projects.lovable_clone.service.FileService;
import org.springframework.stereotype.Service;

@Service
public class FileServiceImpl implements FileService {
    @Override
    public FileTreeResponse getFileTree(Long projectId, Long userId) {
        return null;
    }

    @Override
    public FileContentResponse getFileContent(Long projectId, String path, Long userId) {
        return null;
    }
}
