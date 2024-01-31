/**
 * *********************************************
 * Date         Name                         
 * *********************************************
 * 11-Dec-2019   Sachin Patil aka JavaPatil  
 */


package com.java.student.util.security.admin;


public interface LoginService {

    void signup(SignupRequest signupRequest);

    LoginResponse login(LoginRequest loginRequest);

    void validateOTP(String OTP, String mobileNo);

}
