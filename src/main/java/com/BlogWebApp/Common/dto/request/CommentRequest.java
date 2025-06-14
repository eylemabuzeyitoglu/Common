package com.BlogWebApp.Common.dto.request;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class CommentRequest {

    private Long blogId;
    private Long userId;
    private String comment;

}
