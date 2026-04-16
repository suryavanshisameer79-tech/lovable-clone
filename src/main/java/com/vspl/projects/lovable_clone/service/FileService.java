package com.vspl.projects.lovable_clone.service;

import com.vspl.projects.lovable_clone.dto.project.FileTreeResponse;
import org.jspecify.annotations.Nullable;

public interface FileService {

    FileTreeResponse getFileTree(Long projectId, Long userId);
}
