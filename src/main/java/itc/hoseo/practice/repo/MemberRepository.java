package itc.hoseo.practice.repo;


import itc.hoseo.practice.domain.Member;

import java.util.List;

public interface MemberRepository {

    List<Member> findAll();
    Member save(Member m);

}
