package com.fernirx.user_api.service;

import com.fernirx.user_api.entity.User;

import java.util.List;
import java.util.Optional;

public interface UserService {

    // Lấy tất cả users
    List<User> getAllUsers();

    // Lấy user theo id
    Optional<User> getUserById(Long id);

    // Tạo hoặc cập nhật user
    User saveUser(User user);

    // Xóa user
    void deleteUser(Long id);


}