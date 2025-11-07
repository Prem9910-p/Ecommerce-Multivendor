package com.prem.Ecommerce.Multivendor.Repository;

import com.prem.Ecommerce.Multivendor.Modal.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
