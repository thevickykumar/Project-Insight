package com.example.Project.Managemt.System.request;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ProjectInvitationRequest {
    private Long projectId;
    private String email;
}
