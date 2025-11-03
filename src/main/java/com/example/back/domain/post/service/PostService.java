package com.example.back.domain.post.service;

import com.example.back.domain.post.entity.Post;
import com.example.back.domain.post.repository.PostRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class PostService {
    private final PostRepository postRepository;
    public void write(String title, String content) {
        Post post = Post.builder()
                .title(title)
                .content(content)
                .build();

        postRepository.save(post);
    }

    public void truncate() {
        postRepository.deleteAll();
    }
}
