package com.vspl.projects.lovable_clone.dto.member;

import com.vspl.projects.lovable_clone.enums.ProjectRole;

public record InviteMemberRequest(
        String email,
        ProjectRole role
) {
}
