package itc.hoseo.practice.repo.impl;

import itc.hoseo.practice.domain.Member;
import itc.hoseo.practice.repo.MemberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Primary
public class DBMemberRepository implements MemberRepository {

    @Autowired
    JdbcTemplate template;

    @Override
    public List<Member> findAll() {
        return template.query("select * from member",
                new BeanPropertyRowMapper<>(Member.class));
    }

    @Override
    public Member save(Member m) {
        template.update("insert into member values(?,?)",
                m.getName(),m.getAge());
        return m;
    }
}
