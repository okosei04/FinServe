package com.corebankingservice.Mappers;

import com.corebankingservice.dto.User;
import com.corebankingservice.model.UserEntity;
import org.springframework.beans.BeanUtils;

public class UserMapper extends BaseMapper<UserEntity, User> {
    private BankAccountMapper bankAccountMapper = new BankAccountMapper();

    @Override
    public UserEntity convertToEntity(User dto, Object... args) {
        UserEntity entity = new UserEntity();
        if (dto != null) {
            BeanUtils.copyProperties(dto, entity, "accounts");
        }
        return entity;
    }

    @Override
    public User convertToDto(UserEntity entity, Object... args) {
        User user = new User();
        if (entity != null) {
            BeanUtils.copyProperties(entity, user, "accounts");

            user.setBankAccounts(bankAccountMapper.convertToDtoList(entity.getBankAccounts()));
        }
        return user;
    }
}