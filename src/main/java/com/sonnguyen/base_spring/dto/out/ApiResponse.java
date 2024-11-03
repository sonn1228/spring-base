package com.sonnguyen.base_spring.dto.out;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class ApiResponse<T> {
    private boolean success;
    private String message;
    private T data;
}
