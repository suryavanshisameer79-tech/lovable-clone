package com.vspl.projects.lovable_clone.entity;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.FieldDefaults;

import java.time.Instant;

@Getter
@Setter
@FieldDefaults(level = AccessLevel.PRIVATE)
public class UserLog {

    Long id;
    User user;

    Project project;
    String action;

    Integer tokensUsed;
    Integer durationMs;

    String metaData;  // JSON of {model_used, prompt_used}

    Instant createdAt;
}
