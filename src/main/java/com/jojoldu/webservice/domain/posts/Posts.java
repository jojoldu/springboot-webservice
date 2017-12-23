package com.jojoldu.webservice.domain.posts;

import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Created by jojoldu@gmail.com on 2017. 12. 23.
 * Blog : http://jojoldu.tistory.com
 * Github : https://github.com/jojoldu
 */
@NoArgsConstructor
@Entity
public class Posts {

    @Id
    @GeneratedValue
    private Long id;


}
