package by.tms.entity.role;

import by.tms.entity.AbstractEntity;

import java.util.Optional;

import static java.util.Optional.*;

public class RoleFactory {
    public Optional<AbstractEntity> add(Role role) {
        switch (role) {
            case ADMIN: {
                return of(new Admin());
            }
            case USER: {
                return of(new User());
            }
        }
        return empty();
    }
}
