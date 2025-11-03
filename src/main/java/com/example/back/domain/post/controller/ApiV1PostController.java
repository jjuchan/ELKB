package com.example.back.domain.post.controller;


import com.example.back.domain.post.service.PostService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class ApiV1PostController {
    private final PostService postService;

    @PostMapping("/write")
    public String write() {
        postService.write("테스트 제목", "테스트 내용");
        return "작성완료";
    }
}
