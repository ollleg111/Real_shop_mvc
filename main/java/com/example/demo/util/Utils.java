package com.example.demo.util;

import com.example.demo.exceptions.BedRequestException;
import org.apache.catalina.User;

import javax.servlet.http.HttpSession;
import java.time.LocalDate;

public class Utils {
    public static Long stringToLong(String number) throws BedRequestException {
        try {
            long id = Long.parseLong(number);
            if (id <= 0) {
                throw new BedRequestException(
                        " Status 400: You entered number: " + number +
                                " in method stringToLong(String number)");
            }
            return id;
        } catch (NumberFormatException e) {
            throw new BedRequestException(
                    " Status 400: You entered incorrect data format: " + number +
                            " in method stringToLong(String number)");
        }
    }

    public static LocalDate stringToDate(String date) throws BedRequestException {
        LocalDate localDate;
        try {
            localDate = LocalDate.parse(date);
        } catch (NumberFormatException e) {
            throw new BedRequestException(" Status 400: You entered incorrect date format: " + date);
        }
        return localDate;
    }

//    public static void loginValidation(HttpSession session) throws BedRequestException {
//        isUserWithLogin(session, ((User) session.getAttribute("user")).getId());
//    }
//
//    public static void loginAndAdminValidation(HttpSession session) throws BedRequestException {
//        isUserWithLogin(session, ((User) session.getAttribute("user")).getId());
//        isUserStatusEqualsAdmin(session);
//    }
//
//    public static void isUserWithLogin(HttpSession session, Long userId) throws BedRequestException {
//        User user = (User) session.getAttribute("user");
//        if (user == null || user.getId().equals(userId)) throw
//        new BedRequestException(" Status 400: Wrong password or login" );
//    }
//
//    public static void isUserStatusEqualsAdmin(HttpSession session) throws BedRequestException {
//        User user = (User) session.getAttribute("user");
//        if(!(user.getUserStatus().toString()).equals(UserStatus.ADMIN.toString()))
//            throw new BedRequestException(" Status 400: You do not have permission to change this data ");
//    }

}
