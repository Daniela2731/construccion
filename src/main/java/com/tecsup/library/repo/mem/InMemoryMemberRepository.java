package com.tecsup.library.repo.mem;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

import com.tecsup.library.model.Member;
import com.tecsup.library.repo.MemberRepository;

public class InMemoryMemberRepository implements MemberRepository {

    private final Map<String, Member> data = new HashMap<>();

    @Override
    public Optional<Member> findById(String id) {
        return Optional.ofNullable(data.get(id));
    }

    @Override
    public void save(Member member) {
        data.put(member.getId(), member);
    }
}
