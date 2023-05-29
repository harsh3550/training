package com.model;
import org.springframework.stereotype.Component;
import javax.validation.constraints.*;
import java.util.Arrays;
@Component
public class User {
    @NotNull(message = "is Required.")
    private String user_Id;
    @NotNull(message = "is Required.")
    @Pattern(regexp = "^[a-zA-Z, ]{30}", message = "only Alphabets.")
            private String user_Name;
            @NotNull(message = "is Required.")
            @Pattern(regexp = "/^(?=.*[0-9])(?=.*[a-z])(?=.*[AZ])(?=.*\\W)(?!.* ).{8,16}$/", message = "One Special One Digit and One Alphabet and Min Size is 8.")
            private String password;
            private String date;
            @NotNull
            private String gender;
            @Min(18)
            private int age;
            private String preferredHolidayLocation;
            @NotNull
            @Size(min = 2, message = "Minimum 2 hobbies must be selected.")
    private String hobby[];
    public String getUser_Id() {
        return user_Id;
    }
    public void setUser_Id(String user_Id) {
        this.user_Id = user_Id;
    }
    public String getUser_Name() {
        return user_Name;
    }
    public void setUser_Name(String user_Name) {
        this.user_Name = user_Name;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public String getDate() {
        return date;
    }
    public void setDate(String date) {
        this.date = date;
    }
    public String getGender() {
        return gender;
    }
    public void setGender(String gender) {
        this.gender = gender;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String getPreferredHolidayLocation() {
        return preferredHolidayLocation;
    }
    public void setPreferredHolidayLocation(String
                                                    preferredHolidayLocation) {
        this.preferredHolidayLocation = preferredHolidayLocation;
    }
    public String[] getHobby() {
        return hobby;
    }
    public void setHobby(String[] hobby) {
        this.hobby = hobby;
    }
    @Override
    public String toString() {
        return "User{" +
                "user_Id='" + user_Id + '\'' +
                ", user_Name='" + user_Name + '\'' +
                ", password='" + password + '\'' +
                ", date='" + date + '\'' +
                ", gender='" + gender + '\'' +
                ", age=" + age +
                ", preferredHolidayLocation='" + preferredHolidayLocation + '\'' +
                ", hobby=" + Arrays.toString(hobby) +
                '}';
    }
}
