package com.tecsup.library.repo;

import java.util.Optional;

import com.tecsup.library.model.Member;

public interface MemberRepository {
    Optional<Member> findById(String id);
    void save(Member member);
}
