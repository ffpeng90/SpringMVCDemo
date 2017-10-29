package com.gaussic.repository;

import com.gaussic.model.CsdnEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by ffpeng on 2017/3/7.
 */
@Repository
public interface CsdnRepository extends JpaRepository<CsdnEntity, Long> {

    // 修改博文操作
    @Modifying
    @Transactional
    @Query("update CsdnEntity blog set blog.articleId=:qArticleId, blog.author=:qAuthor, blog.title=:qTitle, blog.readCnt=:qReadCnt, blog.url=:qUrl where blog.csdnBlogId=:qCsdnBlogId")
    void updateBlog(@Param("qArticleId") long articleId, @Param("qAuthor") String author, @Param("qTitle") String title,
                    @Param("qReadCnt") int readCnt, @Param("qUrl") String url, @Param("qCsdnBlogId") long csdnBlogId);
}
