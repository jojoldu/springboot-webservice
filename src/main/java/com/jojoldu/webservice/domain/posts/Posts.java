package com.jojoldu.webservice.domain.posts;

import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.time.LocalDate;
import java.time.LocalDateTime;

/**
 * Created by jojoldu@gmail.com on 2017. 12. 23.
 * Blog : http://jojoldu.tistory.com
 * Github : https://github.com/jojoldu
 */

@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Getter
@Entity
public class Posts {

    @Id
    @GeneratedValue
    private Long id;

    @Column(length = 500, nullable = false)
    private String title;

    @Column(columnDefinition = "TEXT", nullable = false)
    private String content;

    private String author;
    private LocalDateTime createdTime;
    private LocalDateTime updatedTime;

    @Builder
    public Posts(String title, String content, String author, LocalDateTime createdTime, LocalDateTime updatedTime) {
        this.title = title;
        this.content = content;
        this.author = author;
        this.createdTime = createdTime;
        this.updatedTime = updatedTime;
    }
}
