package com.java.student.util.security.dao;

import com.java.student.util.security.admin.LoginRequest ;
import com.java.student.util.security.admin.User;

public interface LoginDao {
  //This is login method.
  User getUserData(LoginRequest loginRequest);
}
