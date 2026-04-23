package com.vspl.projects.lovable_clone.service.impl;

import com.vspl.projects.lovable_clone.dto.member.InviteMemberRequest;
import com.vspl.projects.lovable_clone.dto.member.MemberResponse;
import com.vspl.projects.lovable_clone.dto.member.UpdateMemberRoleRequest;
import com.vspl.projects.lovable_clone.dto.project.ProjectRequest;
import com.vspl.projects.lovable_clone.dto.project.ProjectResponse;
import com.vspl.projects.lovable_clone.dto.project.ProjectSummaryResponse;
import com.vspl.projects.lovable_clone.service.ProjectMemberService;
import com.vspl.projects.lovable_clone.service.ProjectService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProjectMemberServiceImpl implements ProjectMemberService {

    @Override
    public List<MemberResponse> getProjectMembers(Long projectId, Long userId) {
        return List.of();
    }

    @Override
    public MemberResponse inviteMember(Long projectId, InviteMemberRequest request, Long userId) {
        return null;
    }

    @Override
    public MemberResponse updateMemberRole(Long projectId, Long memberId, UpdateMemberRoleRequest request, Long userId) {
        return null;
    }

    @Override
    public MemberResponse deleteProjectMember(Long projectId, Long memberId, Long userId) {
        return null;
    }
}
