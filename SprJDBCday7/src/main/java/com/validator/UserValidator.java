package com.validator;
import com.model.User;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;
@Component
public class UserValidator implements Validator {
    public boolean supports(Class clazz) {
        return User.class.isAssignableFrom(clazz);
    }

    public void validate(Object target, Errors errors) {
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "user_Id",
                "error.user_Id", "User ID is Required.");
        ValidationUtils.rejectIfEmptyOrWhitespace(errors,
                "user_Name", "error.user_Name", "User Name is Required.");
        ValidationUtils.rejectIfEmptyOrWhitespace(errors,
                "password", "error.password", "Password is Required.");
    }
}
