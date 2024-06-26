package com.aula.dto;

import org.hibernate.validator.constraints.Length;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

/**
 * Used as response and request object that represents a Lesson.
 */
public record LessonDTO(
                Long id,
                @NotNull @NotBlank @Length(min = 5, max = 100) String name,
                @NotNull @NotBlank @Length(min = 10, max = 11) String youtubeUrl) {

}