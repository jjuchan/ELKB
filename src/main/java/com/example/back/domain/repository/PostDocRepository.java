package com.example.back.domain.repository;


import com.example.back.domain.document.PostDoc;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

public interface PostDocRepository extends ElasticsearchRepository<PostDoc, String> {
}
