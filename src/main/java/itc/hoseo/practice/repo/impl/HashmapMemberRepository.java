package itc.hoseo.practice.repo.impl;

import itc.hoseo.practice.domain.Member;
import itc.hoseo.practice.repo.MemberRepository;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class HashmapMemberRepository implements MemberRepository {

    private HashMap<String,Member> map = new HashMap<>();

    @Override
    public List<Member> findAll() {
        return map.values().stream().collect(Collectors.toList());
    }

    @Override
    public Member save(Member m) {
        return map.put(m.getName(), m);
    }
}
