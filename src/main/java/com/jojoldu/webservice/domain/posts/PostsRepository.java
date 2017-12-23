package com.jojoldu.webservice.domain.posts;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by jojoldu@gmail.com on 2017. 12. 23.
 * Blog : http://jojoldu.tistory.com
 * Github : https://github.com/jojoldu
 */

public interface PostsRepository extends JpaRepository<Posts, Long>{
}
