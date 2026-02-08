package org.gevernova.taskmanagement.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Data
public class TaskRequest {

    @NotBlank(message = "Title required")
    private String title;

    @NotBlank(message = "Description required")
    private String description;

    @NotNull(message = "User Id required")
    private Long userId;

    @NotNull(message = "Category Id required")
    private Long categoryId;

    @NotNull(message = "Priority Id required")
    private Long priorityId;
}
