package com.lin.shulan.repository;

import com.lin.shulan.entity.DangdiGentuan;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface GentuanRepository extends JpaRepository<DangdiGentuan, Integer> {

    DangdiGentuan findBypostid(Integer postId);//通过postid找

    DangdiGentuan findByGdate(String gdate);

    @Query("from DangdiGentuan gt where gt.postid=:postid")
    DangdiGentuan findGentuan(@Param("postid") Integer postid);

    @Query(value = "select * from dangdiGentuan", nativeQuery = true)
    List<DangdiGentuan> findAllgentuan();

}
