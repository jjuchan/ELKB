package com.example.back.domain.postDoc.repository;


import com.example.back.domain.postDoc.document.PostDoc;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

import java.util.List;


public interface PostDocRepository extends ElasticsearchRepository<PostDoc, String> {
    List<PostDoc> findByTitleContainingOrContentContaining(String keyword, String keyword2);
}