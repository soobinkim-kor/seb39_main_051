package com.codestates.main.post.dto;

import com.codestates.main.comment.entity.Comment;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.List;

@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class PostResponseDto {
    private Long postId;

    private String title;

    private String content;

    private String type;

    private String category;

    private LocalDateTime createdAt;

    private LocalDateTime modifiedAt;

    private List<Comment> comments;
}
