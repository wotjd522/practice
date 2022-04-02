package itc.hoseo.practice;

import itc.hoseo.practice.domain.Member;
import itc.hoseo.practice.repo.MemberRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class PracticeApplicationTests {

    @Autowired
    private MemberRepository memberRepository ;

    @Test
    void contextLoads() {
        memberRepository.save(new Member("1", "1"));
        memberRepository.save(new Member("2", "2"));
        memberRepository.save(new Member("3", "3"));

        System.out.println(memberRepository.findAll());



    }

}
