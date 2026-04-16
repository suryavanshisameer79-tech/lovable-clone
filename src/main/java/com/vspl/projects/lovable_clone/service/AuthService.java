package com.vspl.projects.lovable_clone.service;

import com.vspl.projects.lovable_clone.dto.auth.AuthResponse;
import com.vspl.projects.lovable_clone.dto.auth.LoginRequest;
import com.vspl.projects.lovable_clone.dto.auth.SignUpRequest;
import org.jspecify.annotations.Nullable;

public interface AuthService {

    AuthResponse signUp(SignUpRequest request);

    AuthResponse login(LoginRequest request);
}
