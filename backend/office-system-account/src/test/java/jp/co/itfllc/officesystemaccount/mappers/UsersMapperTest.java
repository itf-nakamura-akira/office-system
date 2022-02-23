package jp.co.itfllc.officesystemaccount.mappers;

import static org.assertj.core.api.Assertions.assertThat;
import java.util.List;
import org.junit.jupiter.api.Test;
import org.mybatis.spring.boot.test.autoconfigure.MybatisTest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import jp.co.itfllc.officesystemaccount.entities.UsersEntity;

@MybatisTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
public class UsersMapperTest {
    @Autowired
    private UsersMapper usersMapper;

    @Test
    public void findAllTest() {
        List<UsersEntity> usersList = this.usersMapper.findAll();

        // 件数の確認
        assertThat(usersList.size()).isEqualTo(11);

        // データの確認
        assertThat(usersList.get(0).getAccount()).isEqualTo("yamanouchi");
    }
}
