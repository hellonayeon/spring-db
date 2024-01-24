package me.hellonayeon.jdbc.connection;

import java.sql.SQLException;
import lombok.extern.slf4j.Slf4j;
import me.hellonayeon.jdbc.domain.Member;
import me.hellonayeon.jdbc.repository.MemberRepositoryV0;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

@Slf4j
public class MemberRepositoryV0Test {

    MemberRepositoryV0 repository = new MemberRepositoryV0();

    @Test
    void crud() throws SQLException {
        // save
        Member member = new Member("memberV0", 10000);
        repository.save(member);

        // findById
        Member findMember = repository.findById(member.getMemberId());
        log.info("findMember = {}", findMember);
        Assertions.assertThat(findMember).isEqualTo(member);
    }

}
