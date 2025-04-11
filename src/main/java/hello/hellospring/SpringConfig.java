package hello.hellospring;

import hello.hellospring.aop.TimeTraceApp;
import hello.hellospring.repository.*;
import hello.hellospring.service.MemberService;
import jakarta.persistence.EntityManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

@Configuration
public class SpringConfig {
/*
    private EntityManager em;

    public SpringConfig(EntityManager em) {
        this.em = em;
    }
*/
    private final MemberRepository memberRepository;

    @Autowired
    public SpringConfig(MemberRepository memberRepository) {
        this.memberRepository = memberRepository;
    }

    @Bean
    public MemberService memberService() {
        return new MemberService(memberRepository);
    }
/*
    @Bean
    public TimeTraceApp timeTraceApp() {
        return new TimeTraceApp();
    }
*/
/*

    @Bean
    public MemberRepository memberRepository(DataSource dataSource) {
        return new MemberRepository();
        return new JdbcMemberRepository(dataSource);
        return new JdbcTemplateMemberRepository(dataSource);
        return new JpaMemberRepository((em);
    }
*/
}
