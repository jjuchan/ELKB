package com.example.back.domain.postDoc.service;


import com.example.back.domain.postDoc.document.PostDoc;
import com.example.back.domain.postDoc.repository.PostDocRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
@RequiredArgsConstructor
public class PostDocService {
    private final PostDocRepository postDocRepository;

    public PostDoc write( String title, String content) {
        PostDoc postDoc = PostDoc.builder()
                .title(title)
                .content(content)
                .build();
        return postDocRepository.save(postDoc);
    }

    public void truncate() {
        postDocRepository.deleteAll();
    }

    public List<PostDoc> findByTitle(String keyword) {
        return postDocRepository.findByTitleContainingOrContentContaining(keyword, keyword);
    }
}
