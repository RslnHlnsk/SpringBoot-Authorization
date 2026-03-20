package ru.netology.auth.repository;

import ru.netology.auth.model.Authorities;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class UserRepository {

    public List<Authorities> getUserAuthorities(String user, String password) {
        // В реальной реализации сюда бы подключался БД
        // Для примера реализуем простую фиктивную логику
        if ("admin".equals(user) && "admin123".equals(password)) {
            List<Authorities> authorities = new ArrayList<>();
            authorities.add(Authorities.READ);
            authorities.add(Authorities.WRITE);
            authorities.add(Authorities.DELETE);
            return authorities;
        } else if ("user".equals(user) && "12345".equals(password)) {
            List<Authorities> authorities = new ArrayList<>();
            authorities.add(Authorities.READ);
            return authorities;
        }
        // Пользователь не найден или неверные данные
        return new ArrayList<>();
    }
}
