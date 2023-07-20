package hello.jdbc.repository;


import hello.jdbc.domain.Member;

public interface MemberRepository {
    Member save(Member member);
    Member findById(String memeberId);
    void update(String memmberId, int money);
    void delete(String memberId);
}
