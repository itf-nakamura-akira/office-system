package jp.co.itfllc.officesystemaccount.mappers;

import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import jp.co.itfllc.officesystemaccount.entities.UsersEntity;

@Mapper
public interface UsersMapper {
    public List<UsersEntity> findAll();
}
