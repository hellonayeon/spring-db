package me.hellonayeon.jdbc.connection;

import java.sql.SQLException;
import me.hellonayeon.jdbc.domain.Member;
import me.hellonayeon.jdbc.repository.MemberRepositoryV0;
import org.junit.jupiter.api.Test;

public class MemberRepositoryV0Test {

    MemberRepositoryV0 repository = new MemberRepositoryV0();

    @Test
    void crud() throws SQLException {
        // save
        Member member = new Member("memberV0", 10000);
        repository.save(member);
    }

}
